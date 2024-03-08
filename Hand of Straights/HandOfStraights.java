class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int card : hand) {
            pq.offer(card);
        }

        while (!pq.isEmpty()) {
            int startCard = pq.poll();
            for (int i = 1; i < groupSize; i++) {
                if (!pq.remove(startCard + i)) {
                    return false;
                }
            }
        }

        return true;

    }
}
