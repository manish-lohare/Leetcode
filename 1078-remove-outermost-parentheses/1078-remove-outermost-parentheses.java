class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int depth=0;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                if(depth>0){
                    sb.append(ch[i]);
                }
                depth++;
            }
            else if(ch[i]==')'){
                depth--;
                if(depth>0){
                    sb.append(ch[i]);
                }
            }
        }
        return sb.toString();
    }
}