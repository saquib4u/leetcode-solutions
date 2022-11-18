class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        if (nums[size - 1] != size) return size;
        
        for (int i = 0; i < size; i++) {
            if (nums[i] != i) return i;
        }
        
        return 0;
    }
}