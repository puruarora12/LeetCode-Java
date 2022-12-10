class Solution {
    public int maximumValue(String[] strs) {
        int value = 0 ;
        
        for(String i: strs){
            int size  =-1;
            for(char a: i.toCharArray()){
                if(a>=97 && a<=122)  size = i.length(); 
            }
            if(size==-1) size = Integer.parseInt(i);
            
            
            if(size>value) value= size;
        }
        return value;
    }
}
