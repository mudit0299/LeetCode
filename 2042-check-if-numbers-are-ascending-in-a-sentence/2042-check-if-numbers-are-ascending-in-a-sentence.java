class Solution {
    public boolean areNumbersAscending(String s) {
        s = s.replaceAll("[^-?0-9]+", " "); 
    List<String> arr=Arrays.asList(s.trim().split(" "));
    int res[]=new int[arr.size()];
    for(int i=0;i<arr.size();i++) {
    	int p=Integer.parseInt(arr.get(i));
    	res[i]=p;
    }
    
    for(int i=1;i<res.length;i++) {
    	if(res[i]<=res[i-1]) {
    		return false;	
    	}	
    }
    return true;
    }
}