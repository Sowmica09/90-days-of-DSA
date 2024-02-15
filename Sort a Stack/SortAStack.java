class GfG{
    public static void insert(Stack<Integer> s , int top){
        if(s.isEmpty() ||(!s.isEmpty() && s.peek()< top)){
            s.push(top);
            return;
        }
        int val = s.peek();
        s.pop();
        insert(s,top);
        s.push(val);
     }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.isEmpty()){
		    return s;
		}
		int top = s.peek();
		s.pop();
		sort(s);
		insert(s,top);
		return s;
	}
}
