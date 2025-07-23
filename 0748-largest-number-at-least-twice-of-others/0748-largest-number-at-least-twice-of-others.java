class Solution {
    public int dominantIndex(int[] nums) {
        int MaxIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[MaxIndex])
                MaxIndex=i;
        }
        for(int n:nums)
        {
            if((n!=nums[MaxIndex])&&(2*n>nums[MaxIndex]))
                return -1;
        }
        return MaxIndex;
    }
}