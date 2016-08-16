public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    //   int base = 1;
    //   int total = 0;
    //   for(int i=31;i>=0;i--) {
    //       total += base * get_bit(n,i);
    //       base *= 2;
    //   }
    //   return total;
        
    // }
    // private int get_bit(int n, int t) {
    //     int tmp = 1;
    //     return (n>>t)&tmp;
    // }
    int res = 0;
    for(int i=0; i<32;i++) {
        res = (res<<1)|(n&1);    //remember this way to reverse bits, avoid trivial code style,like code above.
        n>>>=1;
    }
    return res;
    }
}