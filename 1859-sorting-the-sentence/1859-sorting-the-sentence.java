class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
    String res[]=new String[arr.length];
    
    //Arrays.sort(arr);
     for(int i=0;i<arr.length;i++) {
    	int a=arr[i].charAt(arr[i].length()-1)-'0';
    	String x=arr[i].substring(0, arr[i].length()-1);
    	System.out.println(x);
    	res[a-1]=x;
    	
    }
        String ans=String.join(" ", res);
      return ans;  
}
}