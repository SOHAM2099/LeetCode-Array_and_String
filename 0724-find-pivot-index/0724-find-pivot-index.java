class Solution {
    //SOHAM2099
    public int pivotIndex(int[] nums) {

        int[] SumLeft = new int[nums.length];
        int[] SumRight = new int[nums.length];
        int left = 0, right = 0;

        for (int i = 0; i < nums.length; i++) {
            SumLeft[i] = left;
            left += nums[i];

            SumRight[nums.length - 1 - i] = right;
            right += nums[nums.length - 1 - i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (SumLeft[i] == SumRight[i])
                return i;
        }
        return -1;
    }
}