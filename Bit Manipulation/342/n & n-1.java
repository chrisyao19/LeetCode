public class Solution {
    public boolean isPowerOfFour(int num) {
        // if(num==0) return false;
        // int cmp = 1;
        // boolean flag = true;
        // while(num!=0) {
        //     if(flag==true) {
        //         if((num&cmp)==1){
        //             num = num >> 1;
        //             break;
        //         }
        //     } else {
        //         if((num&cmp)==1){
        //             return false;
        //         }
        //     }
        //     flag = !flag;
        //     num = num >> 1;
        // }
        // if(num==0){
        //     return true;
        // } else {
        //     return false;
        // }
        //Solution2: using n & (n-1) AGAIN
        return (num>0 && (num&(num-1))==0 && (num&0x55555555)!=0);
    }
}