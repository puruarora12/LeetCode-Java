class Solution {
    public int nextGreaterElement(int n) {
        int OG=n;
        String ss="";
        while(n!=0){
        ss= n%10 +ss;
        n/=10;
        }
        boolean fixed=false;
        
        char[] s = ss.toCharArray();
        int small = s.length-1;
    
        for(int i= s.length-1 ; i>0; i--){
        
            if(s[i]<s[small])small=i;
          if(s[i-1]<s[i]){
            int temp =i;
            small=temp;
            while(temp<s.length ){
               
                if(s[temp]>s[i-1] && s[small]>s[temp]) small=temp;
                temp++;
            } 
           
            char t =s[i-1];
            s[i-1]=s[small];
            s[small]=t;
            fixed=true;
            small=i;
            break;
          }
        }
        Arrays.sort(s, small, s.length);
       
        
        long val = Long.parseLong(new String(s));
        if(val==(long) OG) return -1;
       
        return val<=Integer.MAX_VALUE ? (int) val :-1;
    }
}
