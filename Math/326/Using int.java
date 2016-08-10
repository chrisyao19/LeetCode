public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) { return true;}
        else if(n==0||n % 3!=0) {return false;}
        else return isPowerOfThree(n/3);
        //Solution2: 
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return ( n>0 &&  1162261467%n==0);
        //next time, try to think the problem in a different way.
    } 
}