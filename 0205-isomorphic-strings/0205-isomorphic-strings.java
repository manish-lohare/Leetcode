class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character>mapST=new HashMap<>();
        Map<Character,Character>mapTS=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char cS=s.charAt(i);
            char cT=t.charAt(i);

            if(mapST.containsKey(cS)){
                if(mapST.get(cS)!=cT){
                    return false;
                }
            }
            else{
                mapST.put(cS,cT);
            }

            if(mapTS.containsKey(cT)){
                if(mapTS.get(cT)!=cS){
                    return false;
                }
            }
            else{
                mapTS.put(cT,cS);
            }
        }
        return true;
    }
}