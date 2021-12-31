class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> x=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(x.containsKey(s.charAt(i))) {
				x.put(s.charAt(i), x.get(s.charAt(i))+1);
				
			}else {
				x.put(s.charAt(i), 1);
			}
		}
		for(int i=0;i<s.length();i++) {
			if(x.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
    }
}