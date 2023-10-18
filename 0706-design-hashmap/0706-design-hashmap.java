class MyHashMap {
    ArrayList<String> keys;
    ArrayList<String> values;
    public MyHashMap() {
       keys = new ArrayList<>();
       values = new ArrayList<>();
        
     }
    
    public void put(int key, int value) {
        if(keys.contains(""+key)){
            values.set(keys.indexOf(""+key) , ""+value) ;
        }
        else{ 
            keys.add(""+key);
            values.add(""+value);
        }
            
    }
    
    public int get(int key) {
        if(keys.contains(""+key)) return Integer.parseInt(values.get(keys.indexOf(""+key)));
        else return -1;
        
    }
    
    public void remove(int key) {
        if(keys.contains(""+key)){
            int index = keys.indexOf(""+key);
            
            keys.remove(index);
            values.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */