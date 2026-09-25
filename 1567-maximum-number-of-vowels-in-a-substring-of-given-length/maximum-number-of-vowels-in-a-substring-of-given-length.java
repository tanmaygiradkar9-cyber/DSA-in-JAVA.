class Solution {
    public int maxVowels(String s, int k) {

        int windowCount=0;
         int windowMax=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){ // we check first window
                windowCount++;
            }
        }
         windowMax=windowCount;

        for(int i=k;i<s.length();i++){  //in window remove last alphabat and add next alphabat


             if(isVowel(s.charAt(i-k))){  
                windowCount--;

            }
            if(isVowel(s.charAt(i))){ //if vowel present in window so, add in windowCount
                windowCount++;
            }
            windowMax=Math.max(windowMax,windowCount);
            
        }
        return windowMax;
        
    }
    private boolean isVowel(char c){
        return c=='a'|| c=='e'|| c=='i'||c=='o'|| c=='u';
    }
}