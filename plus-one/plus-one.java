class Solution {
    public int[] plusOne(int[] digits) {
        
//          String p="";
// 	        for(int i=0;i<digits.length;i++) {
// 	        	 p=p+String.valueOf(digits[i]);
	        	 
// 	        }
// 	        int x=Integer.parseInt(p)+1;
// 	        String temp = Integer.toString(x);
// 	        int[] numbers = new int[temp.length()];
// 	        for (int i = 0; i < temp.length(); i++) {
// 	            numbers[i] = temp.charAt(i) - '0';
// 	        }
// 	        return numbers;
//     }
         int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
        
}
}