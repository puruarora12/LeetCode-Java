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
        // System.out.println(ss);
        for(int i= s.length-1 ; i>0; i--){
        // System.out.println(s[i-1] + "   "+s[i]+   "   "+(s[i-1]<s[i])  );
            if(s[i]<s[small])small=i;
          if(s[i-1]<s[i]){
            int temp =i;
            small=temp;
            while(temp<s.length ){
                // System.out.println("finding small "+s[small]+"  from "+s[i-1]+ " currr is "+s[temp]);
                if(s[temp]>s[i-1] && s[small]>s[temp]) small=temp;
                temp++;
            } 
            // System.out.println("found small is "+s[small]);
            char t =s[i-1];
            s[i-1]=s[small];
            s[small]=t;
            fixed=true;
            small=i;
            break;
          }
        }
        Arrays.sort(s, small, s.length);
        // System.out.println(s);
        
        long val = Long.parseLong(new String(s));
        if(val==(long) OG) return -1;
        // for(char i:s) System.out.print(i);
        // char[] max = ( (Math.pow(2,31)-1)+"").toCharArray();
        // System.out.println("compare value "+(Arrays.compare(s, max)));
        return val<=Integer.MAX_VALUE ? (int) val :-1;
    }
}
