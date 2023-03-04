class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> ar = new ArrayList<>();
        int temp = num;
        
        while(temp>0){
            ar.add(temp%10);
            temp/=10;
        }
        Collections.sort(ar);
        int num1 =0;
        int num2=0;
        
        int right = ar.size()-1;
        int left = 0;
        int fnum1 =0;
        int fnum2 =0;
        int zeros = 0;
        for(int i =0 ; i<ar.size(); i++){
            if(ar.get(i)==0) {
                zeros++;
                continue;
            }
            if(i%2==0){
                num1 = num1*10+ar.get(i);
                fnum1=1;
            }
            else{
                num2 = num2*10+ar.get(i);
                fnum2=1;
            }
           /* if(fnum1==1 && fnum2==1 && zeros!=0){
                int zero1 = zeros/2;
                int zero2 = zeros-zero1;
                
                for(int j = 0; j<zero1 ; j++) num1*=10;
                for(int j = 0; j<zero2 ; j++) num2*=10;
                zeros=0;
            }*/
            
        }
        return num1+num2;
        
        
    }
}
