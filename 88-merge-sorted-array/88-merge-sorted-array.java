class Solution {
    public void merge(int[] arr, int n, int[] arr2, int m) {
      int first=n-1;
		int second=m-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(second<0) {
				return;
			}
			if(first>=0 && arr[first]>arr2[second]) {
				arr[i]=arr[first];
				first--;
			}else {
				arr[i]=arr2[second];
				second--;
				
			}
			
		}
		return ;
 
    }
}