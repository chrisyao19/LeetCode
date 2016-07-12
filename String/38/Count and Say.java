public class Solution {
    public String countAndSay(int n) {
        // int count = 1;
        // StringBuilder str = new StringBuilder("1");
        // StringBuilder prev = new StringBuilder();
        // char say = str.charAt(0);
        // for(int i=1; i<n ;i++) {
        //     prev = str;
        //     str = new StringBuilder();
        //     count = 1; 
        //     say = prev.charAt(0);
        //     for(int j=1; j < prev.length(); j++) {
        //         if(prev.charAt(j)==say) {
        //             count++;
        //         } else {
        //             str.append(count);
        //             str.append(say);
        //             count = 1;
        //             say = prev.charAt(j);
        //         }
        //     }
        //     str.append(count).append(say);
        // }
        // return str.toString();
        String str = new String("1");
        for(int i=1; i < n; i++) {
            str = helper(str);
        }
        return str;
    }
    
    public String helper(String s) {
        StringBuilder sb = new StringBuilder();
        char say = s.charAt(0); int count = 1;
        for(int i=1; i < s.length(); i++) {
            if(s.charAt(i)==say) {
                count ++;
            } else {
                sb.append(count).append(say);
                count = 1; say = s.charAt(i);
            }
        }
        sb.append(count).append(say);
        return sb.toString();
    }
    
    
    
    
}