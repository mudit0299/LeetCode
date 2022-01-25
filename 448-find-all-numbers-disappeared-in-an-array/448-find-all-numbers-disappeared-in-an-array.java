class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] ans=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]=nums[i];
        }
        List<Integer> res=new ArrayList<>();
        
        for(int i=1;i<ans.length;i++){
            if(ans[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}