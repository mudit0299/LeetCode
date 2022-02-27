class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int arr[] = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            int count = 0;
            int yID = startPos[0];
            int xID = startPos[1];
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j) == 'R'){
                    xID++;
                }
                if(s.charAt(j) == 'L'){
                    xID--;
                }
                if(s.charAt(j) == 'U'){
                    yID--;
                }
                if(s.charAt(j) == 'D'){
                    yID++;
                }
                if(yID < 0 || yID >= n || xID < 0 || xID >= n){
                    break;
                }else{
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;

    }
}