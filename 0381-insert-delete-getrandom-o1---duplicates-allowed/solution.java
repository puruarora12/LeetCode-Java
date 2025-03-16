class RandomizedCollection {
HashMap<Integer,Integer> map ;
ArrayList<Integer> ls ; 
int count ;
    public RandomizedCollection() {
        map =new HashMap<>();
        ls= new ArrayList<>();
        count =0;
    }
    
    public boolean insert(int val) {
        count++;
        boolean present = true;
        if(map.containsKey(val)) present=false;
        map.put(val, map.getOrDefault(val,0)+1);
        ls.add(val);
        return present;
    }
    
    public boolean remove(int val) {
        boolean present = false;
        if(map.containsKey(val)) { 
            map.put(val, map.getOrDefault(val,0)-1);
             present =true;
        if(map.get(val)==0)map.remove(val); 
        ls.remove(Integer.valueOf(val));
        count--;
        }
        
        return present;
    }
    
    public int getRandom() {
        int random = (int)(Math.random()*count);
        return ls.get(random);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
