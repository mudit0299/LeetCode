class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
		 HashMap<Integer, Integer> x=new HashMap<>();
       for(int i=0;i<nums.length;i++) {
       	if(x.containsKey(nums[i])) {
       		x.put(nums[i], x.get(nums[i])+1);
       		
       		
       	}else {
       		x.put(nums[i],1);
       	}
       }
       for(int i:x.keySet()) {
    	   if(x.get(i)>nums.length/3) {
    		   res.add(i);
    	   }
       }
       return res;
    }
}