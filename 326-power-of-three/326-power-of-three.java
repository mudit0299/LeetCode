class Solution {
    public boolean isPowerOfThree(int n) {
//         if(n<=0) {
//         	return false;
//         }
//         double ams=Math.log(n)/Math.log(3);
//         System.out.println(ams);
        
//         return Math.pow(3, (int)ams)==n;
               return (Math.log10(n) / Math.log10(3)) % 1 == 0;

    }
}