class Solution {
    public String customSortString(String order, String str) {
        String ans = "";
        char str2[] = str.toCharArray();
        for (int i = 0 ; i <order.length() ; i++){
            for(int j = 0 ; j<str.length() ; j++){
                if (order.charAt(i)==str2[j]) {
                    ans+=str2[j];
                    str2[j]=0;                    
                }
            }         
        }
        Arrays.sort(str2);
        for(int i =0 ; i <str2.length ; i++)
            if (str2[i]!=0)ans+=str2[i];
        return ans;
    }
}
