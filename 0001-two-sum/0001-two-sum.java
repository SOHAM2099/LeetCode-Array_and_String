class Solution {
    //SOHAM2099
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                // Found the complement, return its index and the current index
                return new int[] { numMap.get(complement), i };
            }

            // If complement not found, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // This part should technically not be reached given the problem constraints
        return new int[] {}; 
    }
}