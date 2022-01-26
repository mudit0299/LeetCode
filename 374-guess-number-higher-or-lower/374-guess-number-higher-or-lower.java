/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
//         int a=1;
//         int b=n;
//         //int mid=(a+b)/2;
        
//         while(a<=b){
//             int mid=(a+b-1)/2;
//             int nn=guess(mid);
//             if(nn==0){
//                 return mid;
//             }else if(nn==-1){
//                 b=b-1;
//             }else{
//                 a=a+1;
//             }
//         }
//         return 1;
        int start = 1, end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==1){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}