class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
    	int rowmin=0;
    	int rowmax=matrix.length-1;
    	int colmin=0;
    	int colmax=matrix[0].length-1;
    	
    	
    	int counter=0;
    	int total=matrix.length*matrix[0].length;
    	
    	while(counter<total){
    	for(int col=colmin;counter<total && col<=colmax ;col++) {
    		ans.add(matrix[rowmin][col]);
    		counter++;
    	}
    	rowmin++;
    	for(int row=rowmin;counter<total && row<=rowmax;row++) {
    		ans.add(matrix[row][colmax]);
    		counter++;
    	}
    	colmax--;
    	for(int col=colmax;counter<total && col>=colmin ;col--) {
    		ans.add(matrix[rowmax][col]);
    		counter++;
    	}
    	rowmax--;
    	
    	
    	for(int row=rowmax;counter<total && row>=rowmin;row--) {
    		ans.add(matrix[row][colmin]);
    		counter++;
    	}
    	colmin++;


    	
    	
    	

    	
    	
        }
    	return ans;
        
    }
}