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
        long sum=((i*(i+1))/2)%mod;
          
            count+= sum%mod;
            
           
        }
       
         return (int)(count%mod);   
        }
     
    }
    

