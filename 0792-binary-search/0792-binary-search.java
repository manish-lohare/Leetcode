class Solution {
    public int search(int[] nums, int target) {
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
            else {
                small=mid+1;
            }
        }
        return -1;
    }
}