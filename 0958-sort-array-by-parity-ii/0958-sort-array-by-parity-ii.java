class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int k=nums.length;
        int ans[]=new int[k];
        int even=0;
        int odd=1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[even]=nums[i];
                even=even+2;
            }
            else if(nums[i]%2==1){
                ans[odd]=nums[i];
                odd=odd+2;
            }
        }
        return ans;
    }
}