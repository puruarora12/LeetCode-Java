class Solution {
    public int romanToInt(String s) {
        int number =0;
        boolean end = true;
        ArrayList<String> pairs = new ArrayList<>(Arrays.asList("IV" ,  "IX" , "XL" , "XC" , "CD" , "CM"));
        for(int i = 0; i<s.length() ; i++){
            if(i+1<s.length() && pairs.contains(s.substring(i,i+2))) {number+=convert(s.substring(i, i+2)); i++; end= false;}
            else {number+=convert(s.substring(i,i+1)); end =true;}
        }
      //  if(end==false) number+=convert(s.charAt(s.length()-1)+"");
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
        case "IV" : return 4;
        case "IX" : return 9;
        case "XL" : return 40;
        case "XC" : return 90;
        case "CD" : return 400;
        case "CM" : return 900;
        }
        return 0;
    }
}
