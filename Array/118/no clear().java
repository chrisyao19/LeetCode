public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows==0) return list;
        for(int i=0; i<numRows;i++) {
            List<Integer> tmp = new ArrayList<Integer>();
            for(int j=0; j < i+1;j++) {
                if(j==0 || j==i) {
                    tmp.add(1);
                } else {
                    tmp.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(tmp);
        }
            //System.out.println(list);
            return list;
    }
        
}