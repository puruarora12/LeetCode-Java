
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int temp = 0;
        int index =0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i =0;i<deck.length ;i++){
            if(deck[i]==deck[index]){
                temp++;
            }
            else{
                al.add(temp);
                index=i;
                temp=1;
            
        }
        }
        al.add(temp);
        if (Collections.min(al)<2)
            return false;
           
        Boolean b  =true;
        for (int i=2 ; i<=Collections.min(al) ; i++){
         
            b= true;
            for (int j:al){
               
                if(j%i!=0){
                    
                    b=false;
                   
                    continue;
                }
                
                    
            }
            if (b==true)
            return true;
        }
        
        return false;
    }
}
