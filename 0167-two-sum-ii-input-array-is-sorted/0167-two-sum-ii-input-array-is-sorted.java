class Solution {
    //SOHAM2099
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        //Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j)
        {
            while(nums[j]>target-nums[i])
                j--;
            if(nums[j]==target-nums[i])
            {
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            i++;
        }
        return result;
    }
}