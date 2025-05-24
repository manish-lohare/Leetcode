class Solution {
    public int maxDepth(String s) {
        int maxParen=0;
        int count=0;
        char ch[]=s.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                maxParen++;
            }
            if(ch[i]==')'){
                count=Math.max(count,maxParen);
                maxParen--;

            }

        }
        return count;
    }
}