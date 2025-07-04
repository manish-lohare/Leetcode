class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1;
        int j=nums[0];
        for(int i=1;i<nums.length;i++){
            if(j<nums[i]){
                diff=Math.max(diff,nums[i]-j);
            }
            else if(j>nums[i]){
                j=nums[i];
            }
        }
        return diff;
    }
}