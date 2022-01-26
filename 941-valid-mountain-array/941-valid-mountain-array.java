class Solution {
    public boolean validMountainArray(int[] arr) {
      if(arr.length<3){
          return false;
      }
        
        int down=-1;
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]==arr[i-1]){
                return false;
            }
            if(arr[i-1]>arr[i]){
                down=i;
                break;
            }
        }
        if(down==-1 || down==1){
            return false;
        }
        
        for(int i=down+1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }
        return true;
        
        
        
    }
}