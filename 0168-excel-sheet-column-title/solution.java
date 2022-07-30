class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Z");
        for(char i='A' ; i<'Z' ; i++) ar.add(""+i);
        while(columnNumber>0){
            //System.out.println(columnNumber%26+"   "+ar.get(columnNumber%26) );
            ans =  ar.get(columnNumber%26)+ans;
            columnNumber--;
            columnNumber/=26;
        }
        return ans;
    }
}
