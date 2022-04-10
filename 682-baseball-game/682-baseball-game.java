class Solution {
    public int calPoints(String[] ops) {
                int count=0;
        	    ArrayList<Integer> res= new ArrayList<>();
	            int sum=0;
	            for(int i=0;i<ops.length;i++){
	                if(ops[i].charAt(0)=='x'){
	                    int x=Integer.parseInt(ops[i]);
	                    System.out.println(x);
	                    res.add(x);
	                    count++;
	                }else if(ops[i].charAt(0)=='+') {
	                	int y=res.get(count-1)+res.get(count-2);
	                	res.add(y);
	                	count++;
	                }else if(ops[i].charAt(0)=='D') {
	                	res.add(res.get(count-1)*2);
	                	count++;
	                	
	                }else if(ops[i].charAt(0)=='C') {
	                	res.remove(count-1);
	                	count--;
	                	
	                }else {
	                	int z=Integer.parseInt(ops[i]);
	                	res.add(z);
	                	count++;
	                }
	            }
	            
	            for(int i:res) {
	            	sum=sum+i;
	            }
	        return sum;

    }
}