public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        help(result, "" ,0,0,n);
        return result;
    }
    
    public void help(List<String> result, String str,int open, int close, int max) {
        if(str.length()==2*max) {
            result.add(str);
            return;
        }
        if(open < max) help(result, str+'(',open+1, close, max);
        if(close < open) help(result, str+')',open, close+1, max);
    }
}