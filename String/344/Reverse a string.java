public class Solution {
    public String reverseString(String s) {
        char[] tmp = s.toCharArray();
        int N = tmp.length;
        // char[] result = new char[tmp.length];
        // int N = tmp.length;
        // int x = 0;
        // for(int i = N-1;i>=0;i--) {
        //     result[x] = tmp[i];
        //     x++;
        // }
        // return new String(result);
        int begin = 0;  int end = N-1;
        while(begin<end) {
            char x = tmp[begin];
            tmp[begin] = tmp[end];
            tmp[end] = x;
            begin++;
            end--;
        }
        return new String(tmp);
        
    }
}