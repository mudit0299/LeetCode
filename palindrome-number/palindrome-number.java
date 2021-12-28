class Solution {
    public boolean isPalindrome(int x) {
        int temp1=x;
        if(x<0){
            return false;
        }
        int ans=0;
        while(x!=0){
            int temp=x%10;
            ans=ans*10+temp;
            x=x/10;
            
        }
        if(temp1==ans){
            return true;
        }else{
            return false;
        }
        
    }
}