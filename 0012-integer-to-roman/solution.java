class Solution {
    public String intToRoman(int nu) {
       String num = ""+nu;
        int size= num.length();
        String symbols[] = {"I" , "V", "X", "L", "C" ,"D" ,"M"} ;
        String ans = "";
        int i =0;
        while(--size>=0 && i<num.length()){
            
            int digit = Integer.parseInt(""+num.charAt(i));
            //num %= 10^(size-1); 
            int index = size*2;
            //System.out.println("size is " +size+ " digit is "+ digit+" index is "+index+"  nums is "+num);
            if (digit<=3) ans += symbols[index].repeat(digit);
            if (digit==4) ans += symbols[index] +symbols[index+1];
            if (digit>=5 && digit<9) ans += symbols[index+1] + symbols[index].repeat(digit-5);
            if (digit==9) ans += symbols[index] + symbols[index+2];
            if (digit==10) ans += symbols[index+2];
            
          i++;  
        }
        return ans;
    }
}
