class Solution {
    public int calPoints(String[] ops) {
        int count=0;
        	    ArrayList<Integer> res= new ArrayList<>();
	        int sum=0;
	            for(int i=0;i<ops.length;i++){
	                if(ops[i].charAt(0)=='x'){
	                	System.out.println(ops[i].charAt(0));
	                    int x=Integer.parseInt(ops[i]);
	                    System.out.println(x);
	                    res.add(x);
	                    count++;
	                    System.out.println(count);
	                }else if(ops[i].charAt(0)=='+') {
	                	System.out.println(ops[i].charAt(0));
	                	int y=res.get(count-1)+res.get(count-2);
	                	res.add(y);
	                	count++;
	                	System.out.println(count);
	                }else if(ops[i].charAt(0)=='D') {
	                	System.out.println(ops[i].charAt(0));
	                	res.add(res.get(count-1)*2);
	                	count++;
	                	System.out.println(count);
	                }else if(ops[i].charAt(0)=='C') {
	                	System.out.println(ops[i].charAt(0));
	                	res.remove(count-1);
	                	count--;
	                	System.out.println(count);
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