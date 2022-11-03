class Solution {
    public int arraySign(int[] nums) {
        int countNegative=0;
        int ans;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                countNegative++;
            }  
        }
        ans = (countNegative % 2 == 0) ? 1 : -1;
        return ans;
       
    }
}