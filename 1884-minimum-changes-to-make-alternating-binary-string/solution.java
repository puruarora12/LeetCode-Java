class Solution {
    public int minOperations(String s) {
        int slen = s.length();
//         String o1 = "";
//         String I1 = "";
//         for (int i = 0 ;i<slen ; i++){
//             if(i%2==0){
//                 o1+="1";
//                 // I1+="0";
                
//             }
//             else{
//                 o1+="0";
//                 // I1+="1";
                
//             }
            
//         }
        
        int diff0 = 0;
        // int diff1 = 0;
        
        for(int i = 0;i<s.length() ; i++){
            if(s.charAt(i)-'0'!=i%2) diff0++;
            // if(s.charAt(i)!=I1.charAt(i)) diff1++;
        }
        return Math.min(diff0 , slen-diff0);
    }
}
