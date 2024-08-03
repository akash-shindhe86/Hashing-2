// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Code was failing for [1,1,1], reason I was looking for nums[i] in map rarther than rSum


// Your code here along with comments explaining your approach: 
//I implemented the way Jaspinder explained in the class by taking running sum approach to avoid nested sub array.

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int rSum =0;

        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            int diff = rSum - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            if(map.containsKey(rSum)){
                map.put(rSum, map.get(rSum) + 1);   
            }else{
                map.put(rSum,1);
            }
        }
        return count;
    }
}