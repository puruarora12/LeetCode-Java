class StockSpanner {

    ArrayList<Integer> ar  ;
    ArrayList<Integer> track;
    public StockSpanner() {
        ar = new ArrayList<>();
        track = new ArrayList<>();
        //track.add(null);
    }
    
    public int next(int price) {
        int sum  =1 ;
        if(ar.size()>=1 && ar.get(ar.size()-1)<=price) {
            //sum += track.get(track.size()-1);
            int i = track.size()-sum+1-1;
            //System.out.println();
            //System.out.println("size: "+track.size()+ "  sum: "+sum + "  i: "+i+" element: "+price );
            while(i>=0 && ar.get(i)<=price ){
                //System.out.println("in while");
                if(track.get(i)==1){
                    i--;
                    sum+=1;
                    //System.out.println("in if at element "+ar.get(i+1)+" sum:  "+sum+" track: "+track.get(i+1)+" i: "+i);
                    continue;
                }
                 //System.out.println("before at element "+ar.get(i)+" sum:  "+sum+" track: "+track.get(i)+" i: "+i);
                if(track.get(i)!=1) {
                    sum+=track.get(i);
                   // System.out.println("after at element "+ar.get(i)+" sum:  "+sum+" track: "+track.get(i)+" i: "+i);
                }
                i=i-track.get(i);
               // System.out.println(i);
            }
            }
        track.add(sum);
        ar.add(price);
        return sum;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
