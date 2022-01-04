class Solution {
    public int reverse(int x) {
//         long ans=0;
//         //long mul=10;
//         while(x!=0){
//             int temp=x%10;
//              ans=ans*+temp;
//             x=x/10;
//             //mul=mul*10;
            
//         }
//         if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
//         return 0;
//         }else{
//            return (int)ans; 
//         }
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;

        
        
    }
}