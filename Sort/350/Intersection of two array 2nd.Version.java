public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //Solution1:
        ArrayList tmp = new ArrayList();
        ArrayList array_result = new ArrayList();
        for(int i:nums1) {
            tmp.add(i);
        }
        for(int j:nums2) {
            if(tmp.contains(j)) {
                array_result.add(j);
                tmp.remove((Object)j);  // ArrayList.remove has two forms, 1. remove(int index)   2.remove(Object o)
            }
        }
        int[] result = new int[array_result.size()];
        int k = 0;
        for(Object s:array_result) {
            result[k++] = (int)s;
        }
        return result;
        
        //Solution2: sort first
        Arrays.sort(nums1); Arrays.sort(nums2);
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int i = 0; int j = 0;
        while(i<nums1.length && j < nums2.length) {
            if(nums1[i] > nums2[j]) {
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                tmp.add(nums1[i]);
                i++; j++;
            }
        }
        int k = 0;
        int[] result = new int[tmp.size()];
        for(int s:tmp) {
            result[k++] = s;
        }
        return result;
        
        //Solution3: editorial solution, using HashMap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int k = 0;
        for(int i:nums1) {
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i,1);
        }
        
        for(int j:nums2) {
            if(map.containsKey(j) && map.get(j)>0) {
                tmp.add(j);
                map.put(j,map.get(j)-1);
            }
        }
        int[] result = new int[tmp.size()];
        for(int s:tmp) {
            result[k++] = s;
        }
        return result;
    }
}
