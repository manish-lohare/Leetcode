class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            String str=Character.toString(x);
            if(words[i].contains(str)){
                ans.add(i);
            }
        }
        return ans;
    }
}