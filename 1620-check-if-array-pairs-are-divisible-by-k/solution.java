class Solution {
    public boolean canArrange(int[] arr, int k) {
        int rems[] = new int[k+k-1];
        for(int i: arr)
            if(i>=0)
            rems[(i%k)+k-1]++;
        else
            rems[k-1+(i%k)]++;
        
//         for(int i : rems)
//         System.out.print(i+" ");
//         System.out.println();
        
        // if(rems[0]%2!=0)return false;
        int i = 0 , j=rems.length-1;
        while(i<=j){
            if(rems[i]>=1 && rems[j]>=1){
                  // System.out.println("i is "+i+" j is "+j);
                if(i==j) rems[i]%=2;
                else{
                int decrease = Math.min(rems[i], rems[j]);
                rems[i]-=decrease;
                rems[j]-=decrease;
                }
            } 
            i++; j--;
        }
        //    for(int z : rems)
        // System.out.print(z+" ");
        // System.out.println("Zero sum");
        
        i=0; j=k-2;
         while(i<=j){
            if(rems[i]>=1 && rems[j]>=1){
                // System.out.println("i is "+i+" j is "+j);
                 if(i==j) rems[i]%=2;
                else{
                int decrease = Math.min(rems[i], rems[j]);
                rems[i]-=decrease;
                rems[j]-=decrease;
                }
            } 
            i++; j--;
        }
        //    for(int z : rems)
        // System.out.print(z+" ");
        // System.out.println("left side sum");
        
        i=k; j=k+k-2;
         while(i<=j){
            if(rems[i]>=1 && rems[j]>=1){
                  // System.out.println("i is "+i+" j is "+j);
                 if(i==j) rems[i]%=2;
                else{
                int decrease = Math.min(rems[i], rems[j]);
                rems[i]-=decrease;
                rems[j]-=decrease;
                }
            } 
            i++; j--;
        }
        //    for(int z : rems)
        // System.out.print(z+" ");
        // System.out.println("right side sum");
        
        int pos =(k-1)*-1;
        for(int z:rems){
            if(z!=0){
                // System.out.println(pos); 
                return false;}
            pos++;
        }
    return true;
    }
}
