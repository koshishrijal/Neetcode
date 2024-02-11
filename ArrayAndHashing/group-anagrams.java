// 49. Group Anagrams
// Solved
// Medium
// Topics
// Companies
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]
 

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //[{"bat",["bat"]},{"ant",["nat","tan"]},["ate","eat","tea"]]
        Map<String,List<String>> stringListMap = new HashMap();
        for( int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedArray = String.valueOf(charArray);
            if(!stringListMap.containsKey(sortedArray)){
                stringListMap.put(sortedArray,new ArrayList<>());
            }
            stringListMap.get(sortedArray).add(strs[i]);
        }
      return new ArrayList<>(stringListMap.values());  
    }
}
