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
             
                    while(shortLeft< shorter.length && shorter[shortLeft].equals(longer[longLeft])){
                        shortLeft++;
                        longLeft++;
                    }
                    while(shortRight>=0 && shorter[shortRight].equals(longer[longRight])){
                        longRight--;
                        shortRight--;
                    }
    
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
      }
}
