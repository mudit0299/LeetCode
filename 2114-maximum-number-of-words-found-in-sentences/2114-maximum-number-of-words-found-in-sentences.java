class Solution {
    public int mostWordsFound(String[] sentences) {
        // int max=-1;
        // for(int i=0;i<sentences.length;i++) {
        // 	String p[]=sentences[i].split(" ");
        // 	if(p.length>max) {
        // 		max=p.length;
        // 	}
        // }
        // return max;
        int max=0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }
}