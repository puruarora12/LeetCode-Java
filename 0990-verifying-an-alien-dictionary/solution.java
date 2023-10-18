class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int al[] =  new int[26];
		for(int i =0 ; i<order.length() ; i++) al[order.charAt(i)-'a'] = i;
		
		for(int i = 1 ; i<words.length ; i++){
			String preword = words[i-1];
			String currword = words[i];
			
			
			
			int pre = preword.length();
			int cur = currword.length();
			if(pre>cur && preword.startsWith(currword)) return false;
			for(int j = 0 ; j<pre && j<cur ; j++){
				if(preword.charAt(j)!=currword.charAt(j))
				if(al[preword.charAt(j)-'a'] >al[currword.charAt(j)-'a']) return false;
				else break;
			
				
			}
			
		}
		return true;
    }
}
