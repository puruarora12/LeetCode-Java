class Solution {
    public String customSortString(String order, String s) {
        int ar[] = new int[26];
        Arrays.fill(ar,0);
        boolean inorder[] = new boolean[26];
        Arrays.fill(inorder, false);
        for(int i = 0 ; i<s.length(); i++){
            ar[s.charAt(i)-'a']++;
        }
        String ans = "";
        for(int i = 0 ;i<order.length() ; i++){
            int index =order.charAt(i)-'a';
            inorder[index]=true;
            while(ar[index]>0) {
                ans+=order.charAt(i);
                ar[index]--;
            }
        }
        
        for(int i = 0 ; i<26 ; i++){
            if(inorder[i]==false && ar[i]>0){
              while(ar[i]>0) {
                ans+=(char)(i+'a');
                ar[i]--;
            }  
            }
        }
        
        
        return ans;
    }
}
