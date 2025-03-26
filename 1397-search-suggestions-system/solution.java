class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TreeMap<String, PriorityQueue<String>> map = new TreeMap<>();
        for(int i =1 ; i<=searchWord.length(); i ++){
            PriorityQueue<String> q= new PriorityQueue<>();
            String word  = searchWord.substring(0,i);
            for(String product: products)if(product.startsWith(word) )q.offer(product);
            map.put(word, q);
        }
        System.out.println(map);
        List<List<String >> ans = new ArrayList<>();
        for(String i :map.keySet()){
            List<String> words = new ArrayList<>();
            PriorityQueue<String>q = map.get(i);
            for(int index =0 ; index<3 && q.size()>0 ; index++){
                words.add(q.poll());
            }
            ans.add(words);
        }
        return ans;
    }
}
