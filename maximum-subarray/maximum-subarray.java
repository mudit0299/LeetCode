class Solution {
    public int maxSubArray(int[] nums) {
		int msf=nums[0];
		int meh=nums[0];
		for(int i=1;i<nums.length;i++ ) {
			meh=Math.max(meh+nums[i], nums[i]);
			msf=Math.max(msf, meh);
			}
		return msf;
//         int sum=0;
// 		int ans=Integer.MIN_VALUE;
// 		for(int i=0;i<nums.length;i++) {
// 			for(int j=i;j<nums.length;j++) {
// 				sum=sum+nums[j];
//                 if(sum>=ans) {
// 				ans=sum;
// 			}
// 			}
			
// 			sum=0;
// 		}
// 		return ans;
    }
}