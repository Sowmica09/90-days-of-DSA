class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
         Map<TreeNode, TreeNode> parentMap = markParentNodes(root);
        Set<TreeNode> visited = new HashSet<>();
        Deque<TreeNode> queue = new LinkedList<>();
        visited.add(target);
        queue.offer(target);
        int currentLevel = 0 , size = 0;
        while (!queue.isEmpty()) {
            if (currentLevel == k) break;
            currentLevel++;
            size = queue.size();
            for (int i = 0; i< size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null && !visited.contains(node.left)) {
                    queue.offer(node.left);
                    visited.add(node.left);
                }
                if (node.right != null && !visited.contains(node.right)) {
                    queue.offer(node.right);
                    visited.add(node.right);
                }
                TreeNode parent = parentMap.get(node);
                if (parent != null && !visited.contains(parent)) {
                    queue.offer(parent);
                    visited.add(parent);
                }
            }
        }
        return queue.stream().map(node -> node.val).toList();
    }
    public Map<TreeNode, TreeNode> markParentNodes(TreeNode root) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        // store <node, parent>
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                parentMap.put(node.left, node);
                queue.offer(node.left);
            }
            if (node.right != null) {
                parentMap.put(node.right, node);
                queue.offer(node.right);
            }
        }
        return parentMap;
    }

}
