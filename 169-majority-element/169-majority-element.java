class Solution {
    public int majorityElement(int[] nums) {
        //   HashMap<Integer, Integer> x=new HashMap<>();
        // for(int i=0;i<nums.length;i++) {
        // 	if(x.containsKey(nums[i])) {
        // 		x.put(nums[i], x.get(nums[i])+1);
        // 		if(x.get(nums[i])>nums.length/2) {
        // 			return nums[i];
        // 		}
        // 	}else {
        // 		x.put(nums[i],1);
        // 	}
        // }
        // return nums[0];
        int count=0;
		int elem=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				elem=nums[i];
			}
			if(nums[i]==elem) {
				count++;
			}else {
				count--;
			}
		}
		return elem;
    }
}