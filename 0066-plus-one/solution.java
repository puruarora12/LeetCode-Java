class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        String ans ="";
        for (int i =digits.length-1 ; i>0 ; i-- ){
            
            if(digits[i]>=10){
                ans=digits[i]%10+ans;
                digits[i]%=10;
                digits[i-1]+=1;
            }else{
                return digits;
            }
        }
        if(digits[0]>=10){
            ans=digits[0]%10+ans;
            ans="1"+ans;
        
        System.out.println(ans);
       int fans[]=Stream.of(ans.split("")).mapToInt(strToken -> Integer.parseInt(strToken)).toArray();
        return fans;
        }else
            return digits;
    }
}
