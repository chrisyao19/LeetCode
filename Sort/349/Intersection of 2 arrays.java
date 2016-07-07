public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // HashSet<Integer> set = new HashSet<Integer> ();
        // Arrays.sort(nums1); Arrays.sort(nums2);
        // int i = 0; int j = 0;
        // while(i < nums1.length && j < nums2.length) {
        //     if(nums1[i] < nums2[j]) {
        //         i++;
        //     } else if(nums1[i] > nums2[j]) {
        //         j++;
        //     } else {
        //         set.add(nums1[i]);
        //         i++; j++;
        //     }
        // }
        // int[] result = new int[set.size()];
        // int s = 0;
        // for(int x:set) {
        //     result[s++] = x;
        // }
        // return result;
        
        //Binary Search
        Set<Integer> set = new HashSet<Integer> ();
        Arrays.sort(nums1);
        for(int n:nums2) {
            if(binarySearch(n,nums1)) {
                set.add(n);
            }
        }
        int[] result = new int[set.size()];
        int s = 0;
        for(int x:set) {
            result[s++] = x;
        }
        return result;
    }
    
    public boolean binarySearch(int n, int[] nums) {
        int low = 0; int high = nums.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == n) {
                return true;
            } else if(nums[mid] > n) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
}