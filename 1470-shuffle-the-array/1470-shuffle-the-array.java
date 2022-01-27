class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] na= new int[nums.length];
        
        int i=0;
        int j=n;
        int count=0;
        while(j<nums.length){
            na[count]=nums[i];
            
            
            na[count+1]=nums[j];
            count+=2;
            i++;
            j++;
        }
        return na;
    }
}