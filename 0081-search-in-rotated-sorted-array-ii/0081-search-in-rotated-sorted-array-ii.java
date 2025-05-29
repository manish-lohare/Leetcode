class Solution {
    public boolean search(int[] nums, int target) {
        if(function(nums,target)==-1){
            return false;
        }
        else return true;
    }
    public int function(int[] nums, int target){
        int st=0;
        int ed=nums.length-1;

        while(st<=ed){
            int mid=(st+ed)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[st] == nums[mid] && nums[mid] == nums[ed]) {
                st++;
                ed--;
            }
            else if(nums[st]<=nums[mid]){
                if(nums[st]<=target && target<nums[mid]){
                    ed=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[ed]){
                    st=mid+1;
                }
                else{
                     ed=mid-1;
                }
            }
        }
        return -1;
    }
}