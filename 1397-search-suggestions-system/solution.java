class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans =  new ArrayList<>();
        TreeMap<String, Integer>map = new TreeMap<>();
        Arrays.sort(products);
        List<String> productList =Arrays.asList(products);
        for(int i =0 ; i<products.length ; i++)map.put(products[i],i);

        String k = "";
        for(char c: searchWord.toCharArray()){
            k+=c;
            String ceil = map.ceilingKey(k);
            String floor = map.floorKey(k+"~");
            if(ceil==null  || floor==null) break;
            ans.add(productList.subList(map.get(ceil) , Math.min(map.get(ceil)+3 ,  map.get(floor)+1) ));
        }
        while (ans.size() < searchWord.length()) ans.add(new ArrayList<>());

        return ans;

    }
}
