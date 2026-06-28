class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            int[] count = new int[26];

            for(int j = 0; j < s.length(); j++){
                char letter = s.charAt(j);
                int numLetter = letter - 'a';
                count[numLetter]++;
            }

            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());


        
    }
}

/*
Let's break this down
first, our goal is finding anagrams inside the array
What do we have to check? 
First, if other strings have same length
Second, if they hold same frequency of letters
Ideally, we can do this by O(n^2)
Why? Because, I can hold one string, loop thru
other strings see if that makes 0 or null
and do that for others

Can we reduce it to better one?
Maybe sorting?
sorting makes n log n
after sort what then, even before that what's the 
criteria of sorting?

*/
