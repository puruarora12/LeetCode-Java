class Solution {
    public String longestPalindrome(String pstring) {
        char[] s = pstring.toCharArray();
        int index[] = new int[2];
        int max = 0;
        for(int i = 0 ;  i<s.length ; i++){
            int[] currIndex = palin(s , i , i);
            if(currIndex[1]-currIndex[0]+1>max){
                max = currIndex[1]-currIndex[0]+1;
                index= currIndex;
            }
            currIndex = palin(s , i , i+1);
            if(currIndex[1]-currIndex[0]+1>max){
                max = currIndex[1]-currIndex[0]+1;
                index= currIndex;
            }
        }
        return pstring.substring(index[0], index[1]+1);

    }
    private
     int[] palin(char[] s , int i , int j ){
        if( (i<0  ||  j>s.length-1) || i!=j && s[i]!=s[j])return new int[]{i,i};
        while(i>0  &&  j<s.length-1 && s[i-1]==s[j+1]){
            
                i--; j++;
        
        }
        return new int[]{i,j}; 
    }
}
