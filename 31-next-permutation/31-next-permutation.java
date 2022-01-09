class Solution {
    public static void nextPermutation(int []arr) {
		if(arr==null || arr.length==0) {
			return;
		}
		int j=arr.length-2;
		while(j>=0 && arr[j]>=arr[j+1]) {
			j--;
		}
		if(j>=0) {
			int i=arr.length-1;
			while(arr[i]<=arr[j]) {
				i--;
			}
			swap(arr,i,j);
		}
		reverse(arr,j+1,arr.length-1);
		
	}
	private static void reverse(int[] arr,int i, int j) {
		while(i<j) {
			swap(arr, i, j);
			i++;j--;
		}
		
	}
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}