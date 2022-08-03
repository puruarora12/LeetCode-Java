class MyCalendar {
    TreeMap<Integer , Integer> m;
    public MyCalendar() {
        m = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> e = m.floorEntry(end-1);
        if(e!=null && e.getValue()>start) return false;
        m.put(start, end );
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
