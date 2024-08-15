class Solution {
    public List<String> letterCombinations(String digits) {
        
        int numlen = digits.length();
        // int words = 1 ;
        // for(char i : digits.split("")){
        //     if(i=='7' || i=='9') words *=4;
        //     else words*=3;
        // }
        List<String> comb = new ArrayList<>();
        for(int i =0 ; i<numlen; i++){
            int words = comb.size();
            String[] chrs =  strs(digits.charAt(i));
            if(words==0) {
                for (int pos = 0 ; pos<chrs.length ; pos++) comb.add(chrs[pos]);
            }
            else{
                for(int pos = 0 ; pos<chrs.length ; pos++)
                    for(int index =0 ; index<words ; index++){
                        comb.add(comb.get(index)+chrs[pos]); 
                }
                //System.out.println(comb);
                for(int index =0 ; index<words ; index++) comb.remove(0);
                //System.out.println(comb);
            }
        }
        return comb;
    }
    public static String[] strs(char digits){
        int digit = Integer.parseInt(digits+"");
        String two[] = new String[]{"a","b","c"};
        String three[] = new String[]{"d","e","f"};
        String four[] = new String[]{"g","h","i"};
        String five[] = new String[]{"j","k","l"};
        String six[] = new String[]{"m","n","o"};
        String seven[] = new String[]{"p","q","r","s"};
        String eight[] = new String[]{"t","u","v"};
        String nine[] = new String[]{"w","x","y","z"};
        
        if(digit ==2) return two;
        else if (digit==3) return three;
        else if (digit==4) return four;
        else if (digit==5) return five;
        else if (digit==6) return six;
        else if (digit==7) return seven;
        else if (digit==8) return eight;
        else return nine;
    } 
}
