class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    private static int mergesort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low>=high) {
			return 0;
		}
		int mid=(low+high)/2;
		int revpair=mergesort(arr, low, mid);
		revpair+=mergesort(arr, mid+1, high);
		revpair+=merge(arr,low,mid,high);
		return revpair;
	}
	private static int merge(int[] arr, int low, int mid, int high) {
		int count=0;
		
		int j=mid+1;
		for(int i=low;i<=mid;i++) {
			while(j<=high && (arr[i]>2*(long)arr[j])) {
				j++;
			}
			count+=j-(mid+1);
		}
		
		ArrayList<Integer> temp=new ArrayList<>();
		int left=low;
		int right=mid+1;
		while(left<=mid&& right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left++]);
			}else {
				temp.add(arr[right++]);
			}
		}
		while(left<=mid) {
			temp.add(arr[left++]);
		}
		while(right<=high) {
			temp.add(arr[right++]);
		}
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
		}
		return count;
	}
}