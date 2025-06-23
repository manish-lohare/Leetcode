class Solution {
    public boolean canJump(int[] nums) {
        int maxLevel=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxLevel) return false;

            maxLevel=Math.max(maxLevel,i+nums[i]);
        }
        return true;
    }
}