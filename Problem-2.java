// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Was unable to understand why we put initial entry of 0,-1 in map.


// Your code here along with comments explaining your approach: 
//I implemented the way Jaspinder explained in the class by taking running sum approach to avoid nested sub array.

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0;
        int maxLength = 0;

        for(int i =0;i < nums.length; i++){
            if(nums[i] == 0){
                rSum--;
            }else{
                rSum++;
            }

            if(map.containsKey(rSum)){
                maxLength = Math.max(maxLength, i - map.get(rSum));
            }else{
                map.put(rSum,i);
            }
        }
        return maxLength;
    }
}