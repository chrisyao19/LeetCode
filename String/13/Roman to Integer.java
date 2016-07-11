public class Solution {
    public int romanToInt(String s) {
        //Solution1: Brute-Force
        // int result = 0;
        // char[] tmp = s.toCharArray();
        // for(int i=0;i<tmp.length;i++) {
        //     if(tmp[i]=='M') result += 1000;
        //     if(tmp[i]=='D') result += 500;
        //     if(tmp[i]=='L') result += 50;
        //     if(tmp[i]=='V') result += 5;
        //     if(tmp[i]=='I') {
        //         if(i!=tmp.length-1 && (tmp[i+1]=='V' || tmp[i+1]=='X')) result -= 1;
        //         else result += 1;
        //     }
        //     if(tmp[i]=='X') {
        //         if(i!=tmp.length-1 && (tmp[i+1]=='L' || tmp[i+1]=='C')) result -= 10;
        //         else result += 10;
        //     }
        //     if(tmp[i]=='C') {
        //         if(i!=tmp.length-1 && (tmp[i+1]=='D' || tmp[i+1]=='M')) result -= 100;
        //         else result += 100;
        //     }
        // }
        // return result;
        
        //Solution2 Using HashMap
        if(s==null || s.length()==0) return 0;
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer> ();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = map.get(s.charAt(len-1));
        int tmp = result;
        for(int i = len-2; i>=0; i--) {
            int curr = map.get(s.charAt(i));
            if(curr >= tmp) result += curr;
            else result -= curr;
            tmp = curr;
        }
        return result;
    }
    
}