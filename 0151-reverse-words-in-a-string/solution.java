class Solution {
    public String reverseWords(String s) {
        String ar[] = s.split(" ");
        String ans = "";
    
        
        if (s.isEmpty())
            return "";
      
        for(int i = 0 ; i<ar.length;i++)
            if(!ar[i].isEmpty())
            ans= ar[i]+" "+ans;
        
        
        return (ans.length()>1) ? ans.substring(0,ans.length()-1): ans;
        
    }
}
