class StockSpanner {

    ArrayList<Integer> ar  ;
    ArrayList<Integer> track;
    public StockSpanner() {
        ar = new ArrayList<>();
        track = new ArrayList<>();
    }
    
    public int next(int price) {
        int sum  =1 ;
        if(ar.size()>=1 && ar.get(ar.size()-1)<=price) {
            int i = track.size()-sum;
            
            while(i>=0 && ar.get(i)<=price ){
                sum+=track.get(i);
                i=i-track.get(i);
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
