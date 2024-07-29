class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int maxArea = 0;
        int right = height.length - 1;
        while(left < right)
        {
            int currMax = Math.min(height[left] , height[right])*(right - left);
            maxArea = Math.max(currMax , maxArea);

            if(height[left]< height[right])
            {
                left++;
            }else{
                right--;
            }


        }
        return maxArea;
    }
}