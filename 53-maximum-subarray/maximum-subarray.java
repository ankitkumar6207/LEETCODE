class Solution {
    public int maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0;i<nums.length;i++)
        {
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            bestSum = Math.max(currentSum,bestSum);
        }
        return bestSum;
    }
}