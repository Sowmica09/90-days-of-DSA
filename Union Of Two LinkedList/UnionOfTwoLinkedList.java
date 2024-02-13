class Sol
{
    public static Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
        private static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node ans = null;

        if (head1.data < head2.data) {
            ans = head1;
            ans.next = merge(head1.next, head2);
        } else if (head2.data < head1.data) {
            ans = head2;
            ans.next = merge(head1, head2.next);
        } else {
            ans = head1;
            ans.next = merge(head1.next, head2.next);
        }

        return ans;
    }
    
      

    public static Node mergeSort(Node head){
         if(head== null || head.next==null){
             return head;
         }
         //find mid
         Node mid = getmid(head);
         //left hand & right hand MergeSort
         Node rightHand = mid.next;
         mid.next=null;
         Node newLeft = mergeSort(head);
         Node newRight = mergeSort(rightHand);
         return merge(newLeft, newRight);
    }
    
    
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    Node join = merge(head1,head2);
	    return mergeSort(join);
	}
}
