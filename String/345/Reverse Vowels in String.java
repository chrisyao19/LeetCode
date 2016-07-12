public class Solution {
    public String reverseVowels(String s) {
    //     char[] result = s.toCharArray();
    //     int begin = 0; int end = result.length-1;
    //     while(begin < end) {
    //         if(!isVowel(result[end])) end--;
    //         if(!isVowel(result[begin])) begin++;
    //         if(isVowel(result[begin]) && isVowel(result[end])){
    //             char tmp = result[end];
    //             result[end--] = result[begin];
    //             result[begin++] = tmp;
    //         }
            
    //     }
    //     return new String(result);
        
    // }
    // public boolean isVowel(char c) {
    //     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
    //     else return false;
    
    //Editorial Solution:
        if(s==null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int begin = 0; int end = chars.length-1;
        while(begin < end) {
            while(begin < end && !vowels.contains(chars[begin]+"")) begin++; //contains(charsequence)
            while(begin < end && !vowels.contains(chars[end]+"")) end--;
            char tmp = chars[begin];
            chars[begin++] = chars[end];
            chars[end--] = tmp;
        }
        return new String(chars);
        
    } 
}