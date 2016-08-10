public class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==1) return true;
        // if(n<=0 || n%2==1) return false;
        // else return isPowerOfTwo(n/2);
        return (n>0 && (n&(n-1))==0); //using n&(n-1) trick, since that the number which is power of 2 has only one dight of '1'.
        
    }
}