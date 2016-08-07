public class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        int num = 0;
        Stack<Integer> stack = new Stack<Integer>();
        char sign = '+';
        s = s.replace(" ","");
        for(int i=0;i<s.length();i++) {
            if(Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if(!Character.isDigit(s.charAt(i)) || i==s.length()-1) {
                if(sign=='+') {
                    stack.push(num);
                }
                if(sign=='-') {
                    stack.push(-num);
                }
                if(sign=='*') {
                    stack.push(stack.pop() * num);
                } 
                if(sign=='/') {
                    stack.push(stack.pop() / num);
                }
                num = 0;
                sign = s.charAt(i);
            }
        }
        int result = 0;
        for(int i:stack) {
            result += i;
        }
        return result;

        
    }
}