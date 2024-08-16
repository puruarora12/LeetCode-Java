class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
       
        TreeMap<Integer, List<Integer>> mins = new TreeMap<>();
        TreeMap<Integer, List<Integer>> maxs = new TreeMap<>();
        int pos= 0;
        for(List<Integer> i: arrays){
            // mins[pos]= i.get(0);
            // maxs[pos]=i.get(i.size()-1);
              int isize = i.size()-1;
            
                
                List<Integer> milist= mins.getOrDefault(i.get(0) , new ArrayList<>());
                milist.add(pos);
                mins.put(i.get(0), milist);
        
            
              
                
                List<Integer> malist= maxs.getOrDefault(i.get(isize) , new ArrayList<>());
                malist.add(pos);
                maxs.put(i.get(i.size()-1), malist);
       
//             
            // List<Integer> malist = new ArrayList<>();
            
            // maxs.put(i.get(i.get(i.size()-1)), maxs.getOrDefault(i.get(i.get(i.size()-1)), malist).add(pos));
            pos++;
            
            
            
           
        }
        // System.out.println(arrays.size());
        int left = 0 ;
        
        int diff= 0;
        Object[] mi = mins.keySet().toArray();
        Object[] ma = maxs.keySet().toArray();
        // System.out.println(mi.length);
        int right = ma.length-1;
        // System.out.println(mins.keySet());
        // System.out.println(maxs.keySet());
        while(left<=right){
            // System.out.println(left+" "+right);
            // System.out.println("left element "+mi[left]+" index "+mins.get(mi[left])+"    right element "+ma[right]+" index  "+maxs.get(ma[right]));
            if(left<mi.length && right>=0 &&(!mins.get(mi[left]).equals(maxs.get(ma[right])) || (mins.get(mi[left]).size()+maxs.get(ma[right]).size()>=3)))  {
                // System.out.println("in if "); 
                diff= Math.abs((int)mi[left]-(int)ma[right]); 
                break;
            }
            else if (mins.get(mi[left]).equals(maxs.get(ma[right])) && left==right ) {
                // System.out.println("in if "); 
                diff= Math.max(Math.abs((int)mi[left]-(int)ma[right]),diff); 
                break;
            }
            else if( (int)mi[left+1]- (int)mi[left]<= (int)ma[right]-(int)ma[right-1]) {
                // System.out.println("in left "+( (int)mi[left+1]- (int)mi[left]) +"    "+((int)ma[right]-(int)ma[right-1])) ;
                left++;
            } 
            else if( (int)mi[left+1]- (int)mi[left]>(int)ma[right]-(int)ma[right-1]){
                // System.out.println("in right "+( (int)mi[left+1]- (int)mi[left]) +"    "+((int)ma[right]-(int)ma[right-1])) ;
                right--;
            }
            else break;
            
            
             // System.out.println(left+" "+right);
        }
        // if(!mins.get(mi[left]).equals(maxs.get(ma[right])))  diff= Math.max(Math.abs((int)mi[left]-(int)ma[right]),diff);
        return diff;
        
        
        // return Math.abs(max-min);
    }
}
