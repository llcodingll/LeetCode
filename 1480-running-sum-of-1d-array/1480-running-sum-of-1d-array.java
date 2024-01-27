class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i]+results[i - 1];
        }
        return results;
    }
}


class Solution{
    public int[] runningSum(int[] nums) {
     for (int i = 1; i < nums.length; i++) {
         nums[i] += nums[i - 1];
     }
        return nums;
    }
}
