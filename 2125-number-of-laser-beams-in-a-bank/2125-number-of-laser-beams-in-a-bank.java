class Solution {
    public int numberOfBeams(String[] bank) {
                int prevRowGuns = 0;
        int ans = 0;
        for(String b : bank){
            int curRowGuns = 0;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)=='1'){
                    curRowGuns++;
                }
            }
            if(curRowGuns!=0){
                ans +=prevRowGuns*curRowGuns;
                prevRowGuns=curRowGuns;
            }
        }
        return ans;

    }
}