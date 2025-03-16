class RandomizedSet {
    List<Integer> ls;
    public RandomizedSet() {
        ls= new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!ls.contains(val)){ ls.add(val); return true;}
        return false;

    }
    
    public boolean remove(int val) {
        if(ls.contains(val)){ls.remove(Integer.valueOf(val)) ;  return true;}
        return false;
    }
    
    public int getRandom() {
        int random = (int)(Math.random()*ls.size());
        // System.out.println(random+" "+ ls);
        return ls.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
