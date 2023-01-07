class DataStream {
    ArrayList<Integer> ar;
    int  val ;
    int freq ;
    Queue<Integer> q ;
    int count;
    public DataStream(int value, int k) {
        ar = new ArrayList<>();
        val =value;
        freq =k;
        q = new LinkedList<>();
        count =0;
    }
    
    public boolean consec(int num) {
        ar.add(num);
        if(q.size()<freq)
            q.add(num);
        else{
                q.poll();
                q.add(num);
        }
        if(num==val) count++;
        else count=0;
        if(count>=freq) return true;
        else return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
