public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] cmp1 = version1.split("\\.");
        String[] cmp2 = version2.split("\\.");
        int max = Math.max(cmp1.length, cmp2.length);
        for(int i= 0; i < max; i++) {
            Integer c1 = i < cmp1.length?Integer.parseInt(cmp1[i]):0;
            Integer c2 = i < cmp2.length?Integer.parseInt(cmp2[i]):0;
            int cmp = c1.compareTo(c2);
            if(cmp!=0) return cmp;
        }
        return 0;
    }
  
}