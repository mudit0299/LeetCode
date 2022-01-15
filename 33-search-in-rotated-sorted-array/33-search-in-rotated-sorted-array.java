class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }public int helper(int[] nums, int target, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j) {
			return -1;
		}
		int mid=(i+j)/2;
		if(nums[mid]==target) {
			return mid;
		}
		
		if(nums[i]<=nums[mid]) {
			if(target>=nums[i] && target<=nums[mid]) {
				return helper(nums, target, i, mid-1);
			}else {
				return helper(nums, target, mid+1, j);
			}
		}
		if(target>=nums[mid] && target<=nums[j]) {
			return helper(nums,target,mid+1,j);
		}
		
			return helper(nums,target,i,mid-1);
		
			
		
		
	}
}