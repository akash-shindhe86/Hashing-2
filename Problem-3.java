// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach: I implemented both hashmap and set approach Jaspinder explained.

class Solution {
    public int longestPalindrome2(String s) {
        HashSet<Character> set = new HashSet<>();
        char [] chars = s.toCharArray();
        int count = 0;
        for(char c : chars){
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.size() != 0) count += 1;
        return count;
    }


    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char [] chars = s.toCharArray();
        int count = 0;
        for(char c : chars){
            if(map.containsKey(c)){
                count += 2;
                map.remove(c);
            }else{
                map.put(c,1);
            }
        }
        if(map.size() != 0) count += 1;
        return count;
    }
}