class Solution {
    public int lengthOfLongestSubstring(String s) {
       int size =0 ;
    HashMap<Character , Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        
        for(int i =0 ; i<s.length();i++){
            int localsize =0;
           //System.out.println(s.charAt(i));
            if(!map.containsKey(s.charAt(i))){
            //    System.out.println("in if");
                map.put(s.charAt(i) , 1);
                q.add(s.charAt(i));
             //   System.out.println(q);
            }else{
              //  System.out.println("in else");
                char a ;
                do{
                    
                    a = q.poll();
                   // System.out.println("the letter is "+a);
                   // System.out.println(q);
                map.remove(a);
                }while(a!=s.charAt(i));
                q.add(s.charAt(i));
                map.put(s.charAt(i) , 1);
           // System.out.println("after else "+q);
            }
            localsize = q.size();
         //   System.out.println(s.charAt(i)+" size "+localsize+" index "+i);
            if(localsize>size)
                size=localsize;
        }
        return size;
    }
}
