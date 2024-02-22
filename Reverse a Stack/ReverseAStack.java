class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int top = s.peek();
        s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    static void pushAtBottom(Stack<Integer> s,int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int val = s.peek();
        s.pop();
        pushAtBottom(s,top);
        s.push(val);
    }
}
