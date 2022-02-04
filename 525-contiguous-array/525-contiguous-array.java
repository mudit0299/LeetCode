class Solution {
    public int findMaxLength(int[] nums) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int zeros = 0, ones = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         if (nums[j] == 0) {
        //             zeros++;
        //         } else {
        //             ones++;
        //         }
        //         if (zeros == ones) {
        //             count = Math.max(count, j - i + 1);
        //         }
        //     }
        // }
        // return count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);
        int sum = 0, max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sumToIndex.containsKey(sum)) {
                max = Math.max(max, i - sumToIndex.get(sum));
            }
            else {
                sumToIndex.put(sum, i);
            }
        }
        
        return max;


    }
}