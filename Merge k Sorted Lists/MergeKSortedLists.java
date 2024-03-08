class Solution {
    class ListNodeComparator implements Comparator<ListNode>{
        public int compare(ListNode k1,ListNode k2){
            if(k1.val>k2.val) return 1;
            else if(k1.val<k2.val) return -1;
            return 0;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new ListNodeComparator());
        // ListNode at[] = new ListNode[lists.length];
         ListNode head = new ListNode(0);
         ListNode tail = head;
         for(int i=0;i<lists.length;i++){
             if(lists[i]!=null){
             pq.add(lists[i]);
             }
         }
         if(pq.isEmpty()) return null;
         while(!pq.isEmpty()){
             ListNode curr = pq.poll();
             tail.next = curr;
             tail = tail.next;
             if(curr.next!=null){
                 pq.add(curr.next);
             }
          }
          return head.next;
    }
}
