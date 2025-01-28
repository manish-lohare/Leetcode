class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        if(isSingleWord(s)){
                return s.length();
            }

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return count;
            }
            count++;
        }

        return -1;
    }
    public static boolean isSingleWord(String str){
        str=str.trim();
        return !str.contains(" ");
    }
}