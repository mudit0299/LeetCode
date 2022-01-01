class Solution {
    public void reverseString(char[] s) {
        
	
	String x="";
	for(int i=s.length-1;i>=0;i--) {
		x+=s[i];
	}
	for(int i=0;i<s.length;i++) {
		s[i]=x.charAt(i);
	}
	
        
    
    }
}