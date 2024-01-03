class Solution {
    public int numberOfBeams(String[] bank) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int i  =0 ; i<bank.length ; i++){
            int lasers = 0;
            for(int j = 0 ; j<bank[i].length()  ; j++){
                if(bank[i].charAt(j)=='1')lasers++;
            }
            map.put(i , lasers);
        }
        
        int lasers = 0;
        int prev = 0 ;
        int next = 0;
        for(int i=0; i <bank.length ; i++){
            if(map.get(i)!=0 && prev==0) prev = map.get(i);
            else if(map.get(i)!=0 && prev!=0) next = map.get(i);
            
            if(prev!=0 && next!=0){
                lasers += prev*next;
                System.out.println(prev+"   "+next);
                prev= next;
                next= 0;
            }
            
        }
        
        
        
        return lasers;
    }
}
