class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ssize = s.length;
        Arrays.sort(s);
        Arrays.sort(g);
        int i = 0 ;
        Queue<Integer> q = new LinkedList<>();
        for(int j :s)q.add(j);
        
        while(i<g.length){
            if(q.isEmpty()) break;
            //System.out.println("g is "+g[i]+"  q is "+q.peek());
            if(g[i]<=q.peek()) {q.poll(); i++;}
            else q.poll();
        }
        //System.out.println(i);
        return i;
    }
}
