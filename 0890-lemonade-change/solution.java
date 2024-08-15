class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for(int i :bills){
            // System.out.println("before "+ i+" "+fives+" "+tens);
            if(i==5) fives++;
            else if(i==10 && fives>0) {fives--;tens++;}
            else if(i==20){
                if(fives>=1 && tens>0){fives-=1; tens--;}
                else if(fives>=3) fives-=3;
                else return false;
            }
            else return false;
            // System.out.println("after "+ i+" "+fives+" "+tens);
            // System.out.println();
        }
        return true;
        
    }
}
