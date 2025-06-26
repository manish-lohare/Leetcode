class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            int diff=Math.abs(nums[i]-nums[i+1]);
            ans=Math.max(diff,ans);
        }
        int sub=Math.abs(nums[nums.length-1]-nums[0]);
        ans=Math.max(sub,ans);
        return ans;
    }
}