class Solution {
    public boolean isPalindrome(String s) {
        String p=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 //System.out.println(p);
		 StringBuilder q=new StringBuilder(p);
		 q.reverse();
		 //System.out.println(q);
		 String t=q.toString();
		 if(p.equals(t)) {
			 return true;
		 }
		 return false;
    }
}