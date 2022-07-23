class Solution {
    public int romanToInt(String s) {
        int number =0;
       int prev = Integer.MAX_VALUE; 
           int curr =0;
        for(int i = 0 ; i<s.length(); i++){
            curr = convert(s.substring(i,i+1));
            if(prev<curr) number=number-(prev*2);
           // System.out.println(number+"   "+prev+"  "+curr);
            number+=curr;
            //System.out.println(number+"   "+prev+"  "+curr);
            prev= curr;
        }
        return number;
    }
    
    public int convert(String a){
        switch (a){
        case "I" : return 1;
        case "V" : return 5;
        case "X" : return 10;
        case "L" : return 50;
        case "C" : return 100;
        case "D" : return 500;
        case "M" : return 1000;
        
        }
        return 0;
    }
}
