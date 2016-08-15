public class Solution {
    public String getHint(String secret, String guess) {
        //Solution1: Find bull first, and cow next, need iteration twice. Using HashMap
        int bull = 0, cow = 0;
        char[] sec = secret.toCharArray();
        char[] gue = guess.toCharArray();
        List<Character> list = new ArrayList<Character>();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<sec.length;i++) {
          if(sec[i]==gue[i]) bull++;
          else {
              list.add(gue[i]);
              if(!map.containsKey(sec[i])) {
                  map.put(sec[i],1);
              } else {
                  int x = map.get(sec[i])+1;
                  map.put(sec[i],x);
              }
          }
        }
        for(char c:list) {
            if(map.containsKey(c)) {
                cow++;
                int j = map.get(c)-1;
                if(j==0) { 
                    map.remove(c);
                } else {
                    map.put(c,j);
                }
            }
        }
        return bull + "A" + cow +"B";
        
        //Solution2: using one-pass interation. Needn't use the HashMap, just increment/decrement number corresponding to the index of array "Number" according secret and guess and determine if cow need to be incremented.
        int bull = 0, cow = 0;
        int[] number = new int[10];
        for(int i=0;i<secret.length();i++) {
            if(secret.charAt(i)==guess.charAt(i)) {
                bull++;
            } else {
                if(number[secret.charAt(i)-'0']<0) cow++;   //means there's such a char in guess.
                if(number[guess.charAt(i)-'0']>0) cow++;    //means there's such a char in secret.
                number[secret.charAt(i)-'0']++;
                number[guess.charAt(i)-'0']--;
            }
        }
        return bull+"A"+cow+"B";
    }
}