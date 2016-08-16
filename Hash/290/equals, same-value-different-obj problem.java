public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] tmp = str.split(" ");
        if(pattern.length()!=tmp.length) return false;
        Map map = new HashMap();
        for(Integer i=0; i<pattern.length();i++) {   //using integer, no autoboxing-smae-value-different-object anymore.
            // if(!map.containsKey(pattern.charAt(i))) {
            //     if(map.containsValue(tmp[i])) return false;
            //     map.put(pattern.charAt(i), tmp[i]);
            // } else {
            //     if(!map.get(pattern.charAt(i)).equals(tmp[i])) return false;
            // }
            if(map.put(pattern.charAt(i),i)!=map.put(tmp[i],i)) return false;
        }
        return true;
    }
}


// // These two have the same value
// new String("test").equals("test") // --> true 

// // ... but they are not the same object
// new String("test") == "test" // --> false 

// // ... neither are these
// new String("test") == new String("test") // --> false 

// // ... but these are because literals are interned by 
// // the compiler and thus refer to the same object
// "test" == "test" // --> true 

// // ... but you should really just call Objects.equals()
// Objects.equals("test", new String("test")) // --> true
// Objects.equals(null, "test") // --> false