class Solution {
    public static  String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (!st.empty()&& st.peek()==ch) {
                st.pop();
               
                
            
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: st){
            sb.append(ch);
        }
        return sb.toString();
        
    }
    
    // public String removeDuplicates(String s) {
    //     char[] arr = s.toCharArray();
    //     int write = 0;

    //     for (int read = 0; read < arr.length; read++) {
    //         arr[write] = arr[read];

    //         if (write > 0 && arr[write] == arr[write - 1]) {
    //             write--;      
    //         } else {
    //             write++;      
    //         }
    //     }

    //     return new String(arr, 0, write);
    // }

}