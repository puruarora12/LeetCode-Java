class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int count = 1 ;
        for(int i =1 ; i<suits.length ; i++) if(suits[i]==suits[i-1]) count++;
        if(count==5 ) return "Flush";
        //HashMap<Integer, Integer> map = new HashMap<>();
        count =0;
        Arrays.sort(ranks);
        int max = 1;
        for(int i =1 ; i<5  ; i++){
          // System.out.println(ranks[i]+" "+ranks[i-1]);
            if(ranks[i]==ranks[i-1]) max++;
            else {
                count=Math.max(max ,count);
                max=1;
            }
            
       // System.out.println(count);
        }
        count=Math.max(max ,count);
        
        if(count>=3) return "Three of a Kind";
        else if (count>=2) return "Pair";
        else return "High Card";
    }
}
