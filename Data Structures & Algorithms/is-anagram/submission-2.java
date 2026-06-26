class Solution {
    public boolean isAnagram(String s, String t) {
        /*If I go over string s and add alphabets 
        frequency to one list
        then go over the string t and do the same. Then compare
        it is s + t*/        
        if(s.length() != t.length()){
            return false;
        }
        Hashtable<Character, Integer> counts = new Hashtable<>();
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(counts.get(letter) != null){
                counts.put(letter, counts.get(letter)+1);
            }
            else{
            counts.put(letter, 1);
            }
        }
        for(int j = 0; j < t.length(); j++){
            char lettert = t.charAt(j);
            if(counts.get(lettert) == null || counts.get(lettert) == 0){
                return false;
            }
            else{
                counts.put(lettert, counts.get(lettert)-1);
            }
        }

        return true;

    }
}
