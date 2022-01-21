class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Set<Integer> set1 = new HashSet<>();
        // Set<Integer> set2 = new HashSet<>();
        // for (int i = 0; i < nums1.length; i++) {
        //     set1.add(nums1[i]);
        // }
        // for (int i = 0; i < nums2.length; i++) {
        //     if (set1.contains(nums2[i])) {
        //         set2.add(nums2[i]);
        //     }
        // }
        // int[] result = new int[set2.size()];
        // int i = 0;
        // for (Integer num : intersect) {
        //     result[i++] = num;
        // }
        // return result;
        ArrayList<Integer> res=new ArrayList<>();
    	HashSet<Integer> x=new HashSet<>();
    	for(int i=0;i<nums1.length;i++) {
    		x.add(nums1[i]);
    	}
    	for(int i=0;i<nums2.length;i++) {
    		if(x.contains(nums2[i])) {
    			if(res.contains(nums2[i])) {
    				
    			}else {
    				res.add(nums2[i]);
    			}
    		}
    	}
    	
    	int result[]=new int[res.size()];
    	int p=0;
    	for(int y:res) {
    		result[p]=y;
    		p++;
    		
    	}
    	return result;
    }
}