class Solution {
    public int findDuplicate(int[] arr) {
        // int total=(nums.length-1)*(nums.length)/2;
        // int sum=0;
        // for(int i=0;i<nums.length;i++) {
        // 	sum=sum+nums[i];
        // }
        // return sum-total;
//         HashMap<Integer, Integer> n=new HashMap<Integer, Integer>();
// 	for(int i=0;i<arr.length;i++) {
// 		if(n.containsKey(arr[i])) {
// 			return arr[i];
// 			//n.put(arr[i],n.get(arr[i]+1));
// 		}else {
// 			n.put(arr[i],1);
// 		}
		
// 	}
// 	return 0;
	// int nums[]=new int[arr.length];
	// for(int i=0;i<arr.length;i++) {
	// 	if(nums[arr[i]]!=0) {
	// 		return arr[i];
	// 	}else {
	// 		nums[arr[i]]=1;
	// 	}
	// }
	// return 0;
        
        //CYCLE METHOD
	int slow=arr[0];
	int fast=arr[0];
	do {
		slow=arr[slow];
		fast=arr[arr[fast]];
	}while(slow!=fast);
	
	fast=arr[0];
	while(slow!=fast) {
		slow=arr[slow];
		fast=arr[fast];
	}
	return slow;
    }
}