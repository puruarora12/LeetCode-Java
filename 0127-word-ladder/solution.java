class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> que = new LinkedList<>();
        que.add(beginWord);
        int level =1 ; 
          
        HashSet<String> hs = new HashSet<>(wordList);
       
        if (!hs.contains(endWord)) return 0;
        if(hs.contains(beginWord)) hs.remove(beginWord); 
        
        while (que.size()>0){
            int sizeofque =  que.size();
            for(int size = 0 ; size<sizeofque;size++){
            String word = que.poll();
            char wordar[] = word.toCharArray();
               
                for(int index =  0 ; index<wordar.length  ; index++){  
                    wordar=word.toCharArray();                  
                    for(char i = 'a' ; i<='z' ;i++){
                        if(word.charAt(index)==i) continue;
                        wordar[index]= i ; 
                        String newword = String.valueOf(wordar);
                        if(hs.contains(newword)){
                            if(newword.equals(endWord)) return level+1;
                            que.add(newword);
                            hs.remove(newword);                        
                        }
                    }
                } 
            }
        level++;
        }
        return 0;
    }
}
