class Solution {
    public int searchInsert(int[] nums, int target) {
        int small=0;
        int high=nums.length-1;
        
        while(small<=high){
            int mid=(small+high)/2; 
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                
                high=mid-1;
            }
            else if(nums[mid]<target){
                small=mid+1;
            }
        }
        return small;
    }
}