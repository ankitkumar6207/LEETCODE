class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length;i++)
        {
            int cnt =0;
            for(int j =0;j<length;j++)
            {
                if(nums[j] == nums[i])
                  cnt++;
            }
            if(cnt > length/2)
              return nums[i];
        }
        return -1;
        
    }
}