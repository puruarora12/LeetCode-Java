class Solution {
    public String convert(String s, int numRows) {
        if (numRows <2)
            return s;
        int charperblock = 2*numRows -2;
        int fullblocks = s.length()/charperblock;
        int halfblocks =1;
        if(s.length()%charperblock>numRows)
            halfblocks = s.length()%charperblock - numRows+1;
        
        int x = fullblocks*(numRows-1)+halfblocks;
        int y = numRows;
        
        
        String ar[][] = new String[x][y];
        int limit = numRows-2;
        int index = 0;
       // System.out.println(x+"  "+y);
        
                
        for(int i = 0 ; i<x ; i++){
            for(int j = 0 ; j<y ; j++){
                if(index>=s.length()){
                    ar[i][j]="";
                }                 
                else if(i%(numRows-1)==0){
                ar[i][j] =""+s.charAt(index);
                limit = numRows-2;
                index++; 
                }
                
                else if( i%(numRows-1)!=0 && j==limit){
                    ar[i][j] =""+s.charAt(index);
                    limit--;
                    index++; 
                }else
                    ar[i][j]="";
                
                
                    
                    
                   
            }
        }
        
        
        /*for(int i =0 ;i<x ; i++){
            for(int j =0 ; j<y ;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("////////////////////");
        */
        String ans="";
        for(int i = 0 ; i<y ; i++){
            
            for(int j =0 ; j<x ; j++){
                if(!ar[j][i].equals(""))
                    ans=ans+ar[j][i];
        //        System.out.print(ar[j][i]);
                
            }
          //  System.out.println();
        }
        
        return ans;
        
    }
}
