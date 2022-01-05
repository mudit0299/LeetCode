class Solution {
    public boolean wordPattern(String pattern, String s) {
         HashMap<Character, String> hm=new HashMap<>();
        String [] p=s.split(" ");
        if (pattern.length() != p.length) {
            return false;
        }
        for(int i=0;i<p.length;i++) {
        	if(hm.containsKey(pattern.charAt(i))) {
        		if(!(hm.get(pattern.charAt(i)).equals(p[i]))){
        			return false;
        		}
        	}else if(hm.containsValue(p[i])) {
        		return false;
        	}else {
        		hm.put(pattern.charAt(i), p[i]);
        	}
        }
		return true;
    }
}