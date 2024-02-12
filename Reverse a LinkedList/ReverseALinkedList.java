class Solution
{
    Node reverse(Node prev,Node curr,Node next){
        if(curr==null)  return prev;
        next=curr.next;
        curr.next=prev;
        return reverse(curr,next,next);
    }
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev = null;
        Node curr=head;
        Node next = curr.next;
        return reverse(prev,curr,next);
    }
}
