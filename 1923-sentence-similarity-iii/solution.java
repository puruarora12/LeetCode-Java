class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String s1[] = sentence1.split(" ");
        String s2[] = sentence2.split(" ");
        String shorter[] = s1.length<s2.length ? s1:s2;
        String longer[] = s1.length>=s2.length?s1:s2;
        
        
        int shortLeft =0;
        int shortRight=shorter.length-1;
        
        int longLeft =0;
        int longRight=longer.length-1;
        
        if(shorter[shortLeft].equals(longer[longLeft])){
            if(shorter[shortRight].equals(longer[longRight])){
                //  inserted in middle section
                shortLeft++;
                longLeft++;
                shortRight--;
                longRight--;
                // while(shortLeft<shortRight){
                    while(shortLeft< shorter.length && shorter[shortLeft].equals(longer[longLeft])){
                        shortLeft++;
                        longLeft++;
                    }
                    // System.out.println("shortleft "+shortLeft+" word "+shorter[shortLeft]);
                    // System.out.println("longerleft "+longLeft+" word "+longer[longLeft]);
                    while(shortRight>=0 && shorter[shortRight].equals(longer[longRight])){
                        longRight--;
                        shortRight--;
                    }
                    // System.out.println("shortRight "+shortRight+" word "+shorter[shortRight]);
                    // System.out.println("longerRight "+longRight+" word "+longer[longRight]);
                // }
                 // System.out.println(shortLeft+"  "+shortRight);
                if(shortLeft<shortRight || (shortLeft==shortRight && !shorter[shortLeft].equals(longer[longLeft])))return false;
            }
            else{
                while(shortLeft<shorter.length && longLeft<longer.length){
                    if(shorter[shortLeft].equals(longer[longLeft])){
                        shortLeft++;
                        longLeft++;
                    }
                    else return false;
                }
            }
            
        }else if (shorter[shortRight].equals(longer[longRight])){
             while(shortRight>=0 && longRight>=0){
                    if(shorter[shortRight].equals(longer[longRight])){
                        shortRight--;
                        longRight--;
                    }
                    else return false;
                }
            }
        
        else return false;
        
        
        return true;
        
        
        
        
        
        
        
        
        
        
//         sentence1 = sentence1.toLowerCase();
//         sentence2= sentence2.toLowerCase();
//         String sen1[] = sentence1.split(" ");
//         String sen2[] = sentence2.split(" ");
        
//         boolean matchNotFound = true;
        
//         int index1 = 0;
//         int index2 = 0;
        
//         while(index1<sen1.length && index2<sen2.length){
//             System.out.println("in  main while statement sen1 word "+sen1[index1]+  "  sen2 words "+sen2[index2]);
//             if(sen1[index1].equals(sen2[index2])){
//                 System.out.println("in if statement");
//                 index1++;
//                 index2++;
//             }else{
//                 System.out.println("in else statement");
//                 if(matchNotFound && sen1.length<sen2.length) { System.out.println("in elseif  sen1<sen2 statement"); index2 =moveForward(sen2, index2, sen1, index1); matchNotFound =false; }
//                 else if(matchNotFound && sen1.length>=sen2.length) {System.out.println("in elseif sen1>sen2 statement"); index1 =moveForward(sen1, index1, sen2, index2); matchNotFound =false;}
//                 else return false;
                  
//             }
            
//         }
        
//         if(matchNotFound && (index1==sen1.length || index2==sen2.length)) return true;
//         System.out.println("index1 "+index1 +" sen1 len  "+sen1.length+ "  index2 "+index2 + " sen2.length "+sen2.length);
        
        
//         if(!matchNotFound && index1 ==sen1.length && index2 == sen2.length) return true;
//         else return false;
        
        
    
    }
    
    public int moveForward(String longer[] , int lindex, String shorter[] , int sindex ){
        System.out.println("in while statement long index "+lindex);
        while(lindex<longer.length && !longer[lindex].equals(shorter[sindex])) lindex++;
        System.out.println("in while statement long index "+lindex);
        return lindex;
    }
}
