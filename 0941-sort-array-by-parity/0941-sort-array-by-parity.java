//odd size  1 and last odd vice versa
//even size 1 (even) and last(odd) vice versa
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=nums.length;
        int ans[]=new int[k];
        int even=0;
        int odd=k-1;
        for(int i=0;i<k;i++){
            if(nums[i]%2==0){
                ans[even]=nums[i];
                even++;
            }
            else{
                ans[odd]=nums[i];
                odd--;
            }
        }
        return ans;
    }
}