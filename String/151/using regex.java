public class Solution {
    public String reverseWords(String s) {
        //Solution1: I REALLY HATE WRITING CODE LIKE THIS!!!
        // s = s.trim();
        // if(s==null || s.length()==0) return "";
        // ArrayList<String> tmp = new ArrayList<String>();
        // String str = "";
        // for(int i=0;i<s.length();i++) {
        //     if(s.charAt(i)!=' ') {
        //         str += s.charAt(i);
        //     } 
        //     if(s.charAt(i)==' ' || i==s.length()-1)
        //     {
        //         if(str!=""){
        //             tmp.add(str);
        //         }
        //         str = "";
        //     }
        // }
        
        // String result = "";
        // int j = tmp.size()-1;
        // while(j>0) {
        //     result += tmp.get(j);
        //     result += " ";
        //     j--;
        // }
        // result += tmp.get(j);
        // return result;
        
        //Solution2: Nice, clean code with regex.
        String[] str = s.trim().split("\\s+");    //  first '\' means escape character, '\s+' means one or more whitespaces
        String result = "";
        for(int i = str.length-1; i > 0; i--) {
            result += str[i];
            result += " ";
        }
        return result += str[0];    //no whitespcace after adding the last element.
        
    }
}