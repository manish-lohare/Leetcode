class Solution {
    public int findLucky(int[] arr) {
        Map <Integer,Integer> hash=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else{
                hash.put(arr[i],1);
            }
        }
        int max=-1;
        for(int key:hash.keySet()){
            int value=hash.get(key);
            if(value==key){
                max=Math.max(max,value);
            }
        }
        
        return max;
    }
}