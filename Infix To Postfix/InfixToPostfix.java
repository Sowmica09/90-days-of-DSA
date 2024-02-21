class Solution {
    public static int prec(char ch){
        if(ch=='^') return 3;
        else if(ch=='*'|| ch=='/') return 2;
        else if(ch=='-'|| ch=='+') return 1;
        return 0;
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                sb.append(ch);
            }else if(ch=='('){
                s.push(ch);
            }else if(ch==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    sb.append(s.peek());
                    s.pop();
                }
                if(!s.isEmpty())
                    s.pop();
           }else{
             while(!s.isEmpty()&& prec(ch)<=prec(s.peek())){
               sb.append(s.peek());
               s.pop();
             } 
           s.push(ch);
          }
        }
          while(!s.isEmpty()){
              sb.append(s.peek());
              s.pop();
          }
          return sb.toString();
    }
}
