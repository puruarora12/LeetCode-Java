class Solution {
    public String reverseWords(String s) {
        String ar[] = s.split(" ");
        String ans = "";
        int v =0;
        if (s.isEmpty())
            return "";
        for(String  i : ar)
            System.out.println(i);
        
        for(int i = 0 ; i<ar.length;i++){
           // if(!ar[i].isEmpty())
            //System.out.println("1");
            if(!ar[i].isEmpty())
            ans= ar[i]+" "+ans;
        }
        return (ans.length()>1) ? ans.substring(0,ans.length()-1): ans;
        
    }
}
