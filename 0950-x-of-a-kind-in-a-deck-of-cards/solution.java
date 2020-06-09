
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int temp = 0;
        int mini =deck.length;
        int index =0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i =0;i<deck.length ;i++){
           // System.out.println(deck[i]);
            if(deck[i]==deck[index]){
            
                temp++;
              //System.out.println("the element is  "+deck[index]+" and the index is "+index+" and the temp is "+temp );
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
          // System.out.println("this is i "+i);
            b= true;
            for (int j:al){
               
                if(j%i!=0){
                    //System.out.println("i is "+i+" j is "+j);
                    b=false;
                   // System.out.println(b);
                    continue;
                }
                //break;
                    
            }
            if (b==true)
            return true;
        }
        
        return false;
    }
}
