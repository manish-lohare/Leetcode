class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");

        while(sb.length()<k){
            int size=sb.length();
            for(int i=0;i<size;i++){
                char nextchar=(char)('a'+((sb.charAt(i)-'a')+1)%26);
                sb.append(nextchar);
            }
        }
        return sb.charAt(k-1);
    }
}