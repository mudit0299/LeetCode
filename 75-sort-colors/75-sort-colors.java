class Solution {
    public void sortColors(int[] arr) {
       //         int lo=0;
       // int mid=0;
       // int hi=arr.length-1;
       // while(mid<=hi) {
       // if(arr[mid]==0) {
       // int temp=arr[lo];
       // arr[lo]=arr[mid];
       // arr[mid]=temp;
       // lo++;
       // mid++;
       // }else if(arr[mid]==1) {
       // mid++;
       // }else {
       // int temp=arr[mid];
       // arr[mid]=arr[hi];
       // arr[hi]=temp;
       // hi--;
       // }
       // }
        bubblesort(arr,arr.length-1,0);
    }
    public void bubblesort(int []arr,int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			
			bubblesort(arr, r, c+1);
		}else {
			bubblesort(arr, r-1, 0);
		}
	}
}