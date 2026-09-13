class Solution {
    public boolean backspaceCompare(String s, String t) {

        int skips=0;
        int skipt=0;

        int i=s.length()-1;
        int j=t.length()-1;

        while(i>=0|| j>=0){
            //for s

            while(i>=0){
                if(s.charAt(i)=='#'){
                    skips++;
                    i--;
                }
                else if(skips>0){
                    i--;
                    skips--;

                }
                else{
                    break;
                }
            }

            // for t
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipt++;
                    j--;
                }
                else if(skipt>0){
                    j--;
                    skipt--;
                }
                else{
                    break;
                }
               
            }
        
        if(i>=0&&j>=0){
            if(s.charAt(i)!=t.charAt(j)){
                return false;
            }
        }
            else if(i>=0||j>=0){
                return false;
            }
            i--;
            j--;
        }
        
        return true;

        
    }
}