class MedianFinder {
    ArrayList<Integer> ar;
    /** initialize your data structure here. */
    public MedianFinder() {
      ar = new ArrayList<>();  
    }
    
    public void addNum(int num) {
        ar.add(num);
    }
    
    public double findMedian() {
        Collections.sort(ar);
        if(ar.size()%2==0){
            return ((ar.get(ar.size()/2) + ar.get((ar.size()/2)-1))/2.0);
        }else return ar.get(ar.size()/2)/1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
