class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
       Arrays.sort(tokens);
        int left = 0; 
        int right = tokens.length-1 ;
        int score=0;
        while(left<=right){
           //System.out.println("start score "+score+" left "+tokens[left] +"  right "+tokens[right]+ "   power "+power);
            if(left>right)break;  
            if(power>=tokens[left]) { power-=tokens[left]; score++; left++;}
           else if(power<tokens[left] && left<right && power+tokens[right]>tokens[left] && score>0){score--; power+=tokens[right]; right--; }
            else return score;
             //System.out.println("After score "+score+" left "+tokens[left] +"  right "+tokens[right]+ "   power "+power);
        }
        return score;
    }
}
