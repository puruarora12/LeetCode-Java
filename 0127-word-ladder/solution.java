class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> que = new LinkedList<>();
        que.add(beginWord);
        int level =1 ; 
        //int size = 0 ; 
        
        HashSet<String> hs = new HashSet<>(wordList);
        //for(String e : wordList) System.out.println(e);
        
        if (!hs.contains(endWord)) return 0;
        if(hs.contains(beginWord)) hs.remove(beginWord); 
        
        while (que.size()>0){
            int sizeofque =  que.size();
            for(int size = 0 ; size<sizeofque;size++){
            String word = que.poll();
            char wordar[] = word.toCharArray();
                boolean similar =false;
                /////////
                System.out.println();
                for(char e: wordar) System.out.print(e+" ");
                System.out.println();
                /////////
                for(int index =  0 ; index<wordar.length  ; index++){  
                            wordar=word.toCharArray();
                    //if(wordar[index]==endWord.charAt(index)) continue;
                    for(char i = 'a' ; i<='z' ;i++){
                        if(word.charAt(index)!=i){ 
                        //System.out.println("word index "+word.charAt(index)+" and 'i' "+i+"  ");
                            wordar[index]= i ; 
                         }
                       String newword = String.valueOf(wordar);
                        //////////
                      //  System.out.print(newword+"   ");
                      //  System.out.print(hs.contains(newword));
                       // System.out.println();
                        /////////
                        
                        if(hs.contains(newword)){
                        if(newword.equals(endWord)) return level+1;
                            que.add(newword);
                            hs.remove(newword);
                            similar=true;
                          //  System.out.println("word is "+newword);
                           // for(String e:hs) System.out.println("elements in set   "+e);
                          ///  System.out.println();
                           // for(String e:que) System.out.println("elements in queue   "+e);
                        }
                    }
                        
                } /// loop to try each char replacement value
        }
                        level++;
        }
        return 0;
    }
}
