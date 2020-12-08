class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (n==0)
            return true;
        if (len<=1 && n<=1  ){
          if (flowerbed[0]==0)
              return true;
            else
                return false;
        }
            /*
            return true; 
        else if (len<=1 && n>1 && flowerbed[0]==1)
            return false;
        else if (len<=1 && n<=1 && flowerbed[0]==0  )
            return true;
        
        */else        
        for(int i = 0 ; i<len ; i++){
            //System.out.println(i);
            if(flowerbed[0]==0 && flowerbed[1]==0){
                flowerbed[0]=1;
           // System.out.println("in first one loop");
                n--;
            }
            else if (flowerbed[i]==0 && i+2<len && flowerbed[i+1]==0   && flowerbed[i+2]==0){
                flowerbed[i+1]=1;
                n--;
             //   for (int j: flowerbed)
               //     System.out.println(j);
                
                //System.out.println("in middle one loop");
            }
            
            else if(flowerbed[len-2]==0 && flowerbed[len-1]==0){
                flowerbed[len-1]=1;
                n--;
            //    System.out.println("in end one loop");
            }
            else 
                continue;
            
            
            if(n==0)
                break;
        }
        if (n==0)
            return true ; 
        else 
            return false;
    }
    

}
