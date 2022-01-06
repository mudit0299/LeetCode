class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=-1;
        for(int i=0;i<sentences.length;i++) {
        	String p[]=sentences[i].split(" ");
        	if(p.length>max) {
        		max=p.length;
        	}
        }
        return max;
    }
}