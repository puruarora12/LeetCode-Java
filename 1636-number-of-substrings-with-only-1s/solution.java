class Solution {
    public int numSub(String s) {
     ArrayList<Long> ar = new ArrayList<Long>();
        int total1=0;
        long count=0;
        long onetillnow=0;
        int flag=0;
        long mod =1000000000+7;
        for(int i =0 ; i<s.length();i++){
            if(s.charAt(i)=='0' && flag==0)
                continue;
            
            if(s.charAt(i)=='1'){
                flag=1;
                onetillnow++;
                total1++;
                }
            if(s.charAt(i)=='0')
                flag=2;
            
            if(flag==2){
                ar.add(onetillnow);
                onetillnow=0;
                flag=0;
            }
            
        }
        if(total1==0)
            return 0;
        if(total1==s.length())
            return (int)s.length()*(s.length()+1)/2;
                
        if(flag==1)
                ar.add(onetillnow);
        
        for(long i:ar){
           System.out.println(i+" ");
           // String aaa = ""+(i*((i+1)/2));
            //System.out.println(aaa);
        long sum=((i*(i+1))/2)%mod;
          //  System.out.println(sum);
            //count+=sum;
            count+= sum%mod;
            //count=count;
           System.out.println("count is "+count);
        }
        //System.out.println("total : "+total1);
        
       /* Collections.sort(ar);
        long a=0;
        a=total1;
        System.out.println(ar.get(ar.size()-1));
        for (int i =2 ; i<=ar.get(ar.size()-1) ; i++){
            for (int j : ar){
                a%=1000000007;
                if(j==i)
                    a++;
                if(j>i)
                    a+=j-1;
            }
        }
        
        
        
        System.out.println(a);
    */
        //System.out.println(count%mod);
        //System.out.println((int)count);
         return (int)(count%mod);   
        }
     
    }
    

