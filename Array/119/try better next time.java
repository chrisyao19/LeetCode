public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0; i<rowIndex+1;i++) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int j=0; j<i+1; j++) {
                if(j==0 || j==i) {
                    tmp.add(1);
                } else {
                    tmp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(tmp);
        }
        return list.get(rowIndex);

        
        
    }
}