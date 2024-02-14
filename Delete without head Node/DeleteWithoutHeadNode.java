class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         if(del.next==null){
             del =null;
             return;
         }
         del.data = del.next.data;
         del.next = del.next.next;
    }
}

