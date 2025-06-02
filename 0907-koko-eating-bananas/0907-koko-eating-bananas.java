class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =0;
        int right=Arrays.stream(piles).max().getAsInt();

        while(left<=right){
            int mid= left+(right-left)/2;
            int time=totTime(piles,mid);
            if(time<=h){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public int totTime(int[]piles,int mid){
        int totH=0;
        for(int i=0;i<piles.length;i++){
            totH+=Math.ceil((double)piles[i]/(double)mid);
        }
        return totH;
    }
    
}