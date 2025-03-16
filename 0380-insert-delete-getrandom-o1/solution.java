class RandomizedSet {
    HashSet<Integer> set;
    List<Integer> ls;
    public RandomizedSet() {
        set = new HashSet<>() ; 
        ls= new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val))ls.add(val);
        return set.add(val);

    }
    
    public boolean remove(int val) {
        if(set.contains(val))ls.remove(Integer.valueOf(val));
        return set.remove(val);
    }
    
    public int getRandom() {
        int random = (int)(Math.random()*set.size());
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
