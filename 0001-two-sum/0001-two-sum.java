class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(hash.containsKey(n)){
                return new int[] {hash.get(n),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
    }
}