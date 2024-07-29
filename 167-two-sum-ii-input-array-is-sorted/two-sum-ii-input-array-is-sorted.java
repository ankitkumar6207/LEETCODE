class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n  = numbers.length;
        int i = 0;
        int j = n-1;
        int[] res = new int[2];

        while(i<j)
        {
            int start = numbers[i];
            int end =  numbers[j];
            if(start + end == target)
            {
                res[0] = i+1;
                res[1] = j+1;
                break;
            }else if(start + end > target)
            {
                j--;
            }else{
                i++;
            }
        }
        return res;
        
    }
}