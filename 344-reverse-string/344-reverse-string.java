class Solution {
    public void reverseString(char[] s) {
        
	
	// String x="";
	// for(int i=s.length-1;i>=0;i--) {
	// 	x+=s[i];
	// }
	// for(int i=0;i<s.length;i++) {
	// 	s[i]=x.charAt(i);
	// }
	
    for(int i=0; i<s.length/2; i++){    //Do it half the number of String length
        char tmp = s[i];
        s[i] = s[s.length-1-i];     //Front swap with other End side 
        s[s.length-1-i] = tmp;      //End swap with other Front side
    }
    
    }
}