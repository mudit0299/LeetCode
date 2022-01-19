class Solution {
    	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    	public  List<String> letterCombinations1(String digits){

        
        //List<String> br=new ArrayList<>()
		
		//br.add("");
		if(digits.length()==0) {
        List<String> br=new ArrayList<>();

            br.add("");
			return br;
		}
            //br.add("");
		char ch=digits.charAt(0);
		System.out.println(ch);
		String ros=digits.substring(1);
		System.out.println(ros);
		
		List<String> rr=letterCombinations1(ros);
		List<String> mr=new ArrayList<>();
		String x=KEYS[Integer.parseInt(Character.toString(ch))];
		System.out.println(x);
		for(int i=0;i<x.length();i++) {
			for(int j=0;j<rr.size();j++) {
			mr.add(x.charAt(i)+rr.get(j));
			System.out.println(mr);
		}
		}

		
		return mr;
	}
    public List<String> letterCombinations(String digits){
        if(digits.length()==0){
            return new ArrayList<String>();
        }else{
            return letterCombinations1(digits);
        }
    }
}