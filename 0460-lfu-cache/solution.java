import java.util.*;

class LFUCache {
    class Node {
        int key, val, freq;
        Node prev, next;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }

    class DoublyLinkedList {
        Node head, tail;
        int size;

        public DoublyLinkedList() {
            head = new Node(-1, -1);
            tail = new Node(-1, -1);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public void addNode(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        public void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        public Node removeLast() {
            if (size == 0) return null;
            Node lastNode = tail.prev;
            removeNode(lastNode);
            return lastNode;
        }
    }

    int capacity, minFreq;
    Map<Integer, Node> keyNodeMap;
    Map<Integer, DoublyLinkedList> freqListMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        keyNodeMap = new HashMap<>();
        freqListMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyNodeMap.containsKey(key)) return -1;

        Node node = keyNodeMap.get(key);
        updateFrequency(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyNodeMap.containsKey(key)) {
            Node node = keyNodeMap.get(key);
            node.val = value;
            updateFrequency(node);
        } else {
            if (keyNodeMap.size() >= capacity) {
                removeLeastFrequent();
            }
            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            freqListMap.putIfAbsent(1, new DoublyLinkedList());
            freqListMap.get(1).addNode(newNode);
            minFreq = 1;
        }
    }

    private void updateFrequency(Node node) {
        int freq = node.freq;
        freqListMap.get(freq).removeNode(node);

        if (freq == minFreq && freqListMap.get(freq).size == 0) {
            freqListMap.remove(freq);
            minFreq++;
        }

        node.freq++;
        freqListMap.putIfAbsent(node.freq, new DoublyLinkedList());
        freqListMap.get(node.freq).addNode(node);
    }

    private void removeLeastFrequent() {
        if (!freqListMap.containsKey(minFreq)) return;

        Node nodeToRemove = freqListMap.get(minFreq).removeLast();
        keyNodeMap.remove(nodeToRemove.key);

        if (freqListMap.get(minFreq).size == 0) {
            freqListMap.remove(minFreq);
        }
    }
}

