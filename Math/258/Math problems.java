public class Solution {
    public int addDigits(int num) {
        // String str = String.valueOf(num);
        // char[] ca = str.toCharArray();
        // System.out.println(ca);
        // int total = 0;
        // for(char c:ca) {
        //     String tmp  = c + "";
        //     total += Integer.parseInt(tmp);
        // }
        // return total>=10?addDigits(total):total;
        
        //Solution2:
        if(num>0 && num % 9==0) return 9;
        return num % 9;
    }
}