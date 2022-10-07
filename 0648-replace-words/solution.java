class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set =new HashSet<>();
        
        for(int i = 0 ; i<dictionary.size() ; i++){
            int j = i+1;
            while(j<dictionary.size()){
                String worda = dictionary.get(i);
                String wordb = dictionary.get(j);
               // System.out.println(worda+"    "+wordb);
                if((worda.length()<=wordb.length() && worda.equals(wordb.substring(0 , worda.length()))))                         dictionary.remove(wordb);
            else if((worda.length()>wordb.length() && wordb.equals(worda.substring(0 , wordb.length()))))
                    dictionary.remove(worda);
                else j++;
            }
        }
        
        //for(int i = 0 ; i<dictionary.size() ; i++) if(set.contains(dictionary.get)) dictionary.remove(word);
       // for(String word : dictionary)System.out.println(word);
        String ans = "";
        for(String i: sentence.split(" ")){
            boolean check =true;
            for(String word: dictionary){
                //System.out.println("word "+word+"  i "+i);
                if(word.length()<=i.length() && word.equals(i.substring(0, word.length()))) {ans+=" "+word; check =false; continue;}
            }
            if(check)ans +=" "+i;
        }
        
        return ans.substring(1, ans.length());
    }
}
