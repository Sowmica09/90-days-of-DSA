class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next== null || k==0){
            return head;
        }
        int cnt=1;
        ListNode curr = head;
        while(curr.next!=null){
            cnt++;
            curr =curr.next;
        }
        curr.next = head;
        k = k%cnt;
        k = cnt-k;
        while(k-- > 0) curr = curr.next;

        head = curr.next;
        curr.next = null;
        return head;
    }
}
