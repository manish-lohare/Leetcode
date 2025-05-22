class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();

        String [] part=s.trim().split("\\s+");
        for(int i=part.length-1;i>=0;i--){
            sb.append(part[i]);
            if(i!=0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}