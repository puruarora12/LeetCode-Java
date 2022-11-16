/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1 ;
        int right = n; 
        
        int mid =0;
        while(true){
            mid = left + (right-left)/2;
            int guessed = guess(mid);
            
            if(guessed==0) break;
            if(guessed==-1) right =mid-1;
            if(guessed==1) left =mid+1;
        }
        return mid;
    }
}
