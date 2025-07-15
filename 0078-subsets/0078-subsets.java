class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>>ans=new ArrayList<>();
        List <Integer> newsubset=new ArrayList<>();
        int index=0;
        solve(nums,index,ans,newsubset);
        return ans;

    }
    public void solve(int []nums,int index,List <List<Integer>>ans,List <Integer> newsubset){
        if(index==nums.length){
            ans.add(new ArrayList<>(newsubset));
            return;
        }
        //exclude
        solve(nums,index+1,ans,newsubset);

        //include
        newsubset.add(nums[index]);
        solve(nums,index+1,ans,newsubset);
        newsubset.remove(newsubset.size()-1);
    }
}