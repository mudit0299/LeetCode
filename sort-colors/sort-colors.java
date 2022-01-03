class Solution {
    public void sortColors(int[] arr) {
               int lo=0;
       int mid=0;
       int hi=arr.length-1;
       while(mid<=hi) {
    	   if(arr[mid]==0) {
    		   int temp=arr[lo];
    		   arr[lo]=arr[mid];
    		   arr[mid]=temp;
    		   lo++;
    		   mid++;
    	   }else if(arr[mid]==1) {
    		   mid++;
    	   }else {
    		   int temp=arr[mid];
    		   arr[mid]=arr[hi];
    		   arr[hi]=temp;
    		   hi--;
    	   }
       }
    }
}