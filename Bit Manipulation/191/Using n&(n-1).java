class Solution {
public:
    int hammingWeight(uint32_t n) {
        // int count = 0;
        // int cmp = 1;
        // for(int i=0; i<32; i++) {
        //     int tmp = n & cmp;
        //     if(tmp!=0) {
        //         count++;
        //     }
        //     cmp <<= 1;
        // }
        // return count;
        
        //Solution2  Using n & (n-1),clearing the least 1 in the 32-bin number.
        int count;
        while(n!=0) {
            n &= (n-1);
            count++;
        }
        return count;
        
    }
};