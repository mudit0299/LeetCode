class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
       int res= binarySearch(nums,start,end,target);
       return res;
    }
public int binarySearch(int[] nums, int start, int end, int target) {
	// TODO Auto-generated method stub
	if(start>end) {
		return -1;
	}
	int mid=(start+end)/2;
	if(nums[mid]==target) {
		return mid;
	}
	if(nums[mid]>target) {
		return binarySearch(nums, start, mid-1, target);
	}
	return binarySearch(nums, mid+1, end, target);
}
}