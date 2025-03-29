class LRUCache {
class node{
    node prev; 
    node next;
    int val;
    int key;

    node(int key, int val){
        this.key = key;
        this.val = val;
    }
}
node head = new node(-1,-1);
node tail = new node(-1,-1);
int cap;

HashMap<Integer, node> map = new HashMap<>();
    public LRUCache(int capacity) {
        cap =capacity;
        head.next = tail;
        tail.prev = head;
    }
    // public void print(){
    //     node temp =head;
    //     while(temp!=null){
    //         System.out.println("key "+temp.key + "   val  "+temp.val);
    //         temp =temp.next;
    //     }
    // }
    public void remove(node n){
      
        node prevNode = n.prev;
        node nextNode = n.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
       
    }

    public void add(node n){
        node prevNode = tail.prev;
        n.next= tail;
        n.prev= prevNode;
        prevNode.next = n;
        tail.prev = n;
    }

    public int get(int key) {
       
        if (map.containsKey(key)){
            int value =  map.get(key).val;
            remove(map.get(key));
            node n = new node(key, value);
            add(n);
            map.put(key, n);
            
            return value;
        }else return -1;
    }
    
    public void put(int key, int value) {
        
        node n = new node(key, value);
        if (map.containsKey(key)){
           
            remove(map.get(key));
        }
        else if (map.size()>=cap){
            
            map.remove(head.next.key);
            remove(head.next);
        }
        add(n);
        map.put(key, n);
   
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
