class Solution {
    public int[] diStringMatch(String s) {
              int[] perm = new int[s.length()+1];
        int l = 0, h=s.length(), i=0;
        while(i < s.length()){
            if(s.charAt(i) == 'I'){
                perm[i++] = l++;  
            }else{
                perm[i++] = h--;
            }
        }
        perm[s.length()] = l;
        return perm;
  
    }
}