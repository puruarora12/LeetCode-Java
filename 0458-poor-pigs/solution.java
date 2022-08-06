class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int iteration = minutesToTest/minutesToDie;
        int count =0 ;
        while(Math.pow((iteration+1),count)<buckets){
            //buckets/=2;
            count++;
            //if(count==iteration) break;
        }
       // System.out.println("pigs used "+count+" buckets left "+buckets);
        return count;
    }
}
