public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1; int j = b.length()-1;
        int sum = 0; int carry = 0;
        while(i>=0 || j>=0) {
            sum = carry;
            sum += (i>=0)?a.charAt(i--)-'0':0;
            sum += (j>=0)?b.charAt(j--)-'0':0;
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry==1) {
            sb.append(1);
        }
        return sb.reverse().toString();
      
        
       
        
    }
}