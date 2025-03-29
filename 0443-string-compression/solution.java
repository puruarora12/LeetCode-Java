class Solution {
    public int compress(char[] chars) {
        if(chars.length<2)return chars.length;
        List<String> ls = new ArrayList<>();
        List<Character> l = new ArrayList<>();
        int count = 0;
        int i =0;
        while( i<chars.length){
            count =1;
            char curr  = chars[i];
            l.add(chars[i]);
            while(i+1<chars.length && chars[i+1]==curr){ count++; i++;}
            // System.out.println(i+"  "+chars[i]);
            ls.add(count+"");
            i++;
             
        }
        int ans =ls.size();
        // System.out.println(ls);
        int index =0 ;
        for(i = 0 ; i<ls.size() ; i++){
            chars[index++]=l.get(i);
            String freq =ls.get(i);
            if(Integer.parseInt(freq)>1){
            for(char c: freq.toCharArray())chars[index++]=c;
            ans+=freq.length();
            }
        }
        // System.out.println(ans);
    
        return ans;
    }
}
