class Solution {
    public int lengthOfLongestSubstring(String s) {
       int size =0 ;
    HashMap<Character , Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        
        for(int i =0 ; i<s.length();i++){
            int localsize =0;
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , 1);
                q.add(s.charAt(i));
            }else{
                char a ;
                do{
                    a = q.poll();
                   map.remove(a);
                }while(a!=s.charAt(i));
                q.add(s.charAt(i));
                map.put(s.charAt(i) , 1);
              }
            localsize = q.size();
           if(localsize>size)
                size=localsize;
        }
        return size;
    }
}