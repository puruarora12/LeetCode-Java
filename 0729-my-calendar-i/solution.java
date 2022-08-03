class MyCalendar {
    ArrayList<Integer> start ;
    ArrayList<Integer> end ;
    public MyCalendar() {
        start = new ArrayList<>();
        end = new ArrayList<>();
    }
    
    public boolean book(int s, int e) {
      //System.out.println("processing "+s+"  "+e);
        for(int i = 0 ; i<start.size() ; i++){
            if((s>=start.get(i) && e<=end.get(i)) || 
               (e>start.get(i)  && e<end.get(i))  || 
               (s>=start.get(i) && s<end.get(i)) || 
               (s<=start.get(i) && e>start.get(i))
              )  return false; 
            
            /*if((s>=start.get(i) && s<end.get(i)) || (e>=start.get(i))  && e<=end.get(i)   ) return false; */
        }
        //System.out.println("                    added "+s+"   "+e);
        start.add(s); end.add(e);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
