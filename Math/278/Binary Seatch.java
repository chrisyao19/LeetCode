/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1, j =n;
        //I even forget the Binary Search.
        // int mid = 0;
        // while(true) {
        //     mid = i+(j-i)/2;
        //     if(isBadVersion(mid)) {
        //         if(!isBadVersion(mid-1)) return mid;
        //         else {
        //             j = mid-1;
        //         }
        //     } else {
        //         if(isBadVersion(mid+1)) return mid+1;
        //         else {
        //             i = mid+1;
        //         }
        //     }
        // }
        while(i<j) {
            
        }
        
    }
}