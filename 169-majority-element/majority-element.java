class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i =0;i<n;i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         int count = map.get(nums[i]);
        //         map.put(nums[i],count+1);
        //     }else{
        //         map.put(nums[i],1);
        //     }

        // }
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>n/2){
        //         return entry.getKey();
        //     }
        // }
        // return 0;

        int count =0;
        int candidate = 0;
        for(int num : nums)
        {
            if(count ==0)
            {
                candidate = num;
            }
            if(candidate  == num)
            {
                count ++;
            }else{
                count--;
            }
        }
        return candidate;
        
    }
}