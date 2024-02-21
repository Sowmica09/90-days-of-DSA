class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> s = new Stack<>();
        for(int i =pre_exp.length()-1;i>=0;i--){
            char ch = pre_exp.charAt(i);
            if(Character.isLetter(ch)){
                s.push(String.valueOf(ch));
            }else if(ch=='+'||ch=='-'|| ch=='*'||ch=='/'){
                s.push('('+s.pop()+ch+s.pop()+')');
            }
        }
        return s.peek();
    
    }
}
