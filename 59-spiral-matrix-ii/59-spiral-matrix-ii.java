class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        //List<Integer> ans=new ArrayList<>();
    	int rowmin=0;
    	int rowmax=matrix.length-1;
    	int colmin=0;
    	int colmax=matrix[0].length-1;
    	
    	
    	int counter=1;
    	int total=matrix.length*matrix[0].length;
    	//Traversing First row
    	while(counter<=total){
    	for(int col=colmin;counter<=total && col<=colmax ;col++) {
    		matrix[rowmin][col]=counter;
    		counter++;
    	}
    	rowmin++;
            
            //Traversing Last Column
    	for(int row=rowmin;counter<=total && row<=rowmax;row++) {
    		matrix[row][colmax]=counter;
    		counter++;
    	}
    	colmax--;
            //Traversing Last Row
    	for(int col=colmax;counter<=total && col>=colmin ;col--) {
    		matrix[rowmax][col]=counter;
    		counter++;
    	}
    	rowmax--;
    	
    	//Traversing first column
    	for(int row=rowmax;counter<=total && row>=rowmin;row--) {
    		matrix[row][colmin]=counter;
    		counter++;
    	}
    	colmin++;
        }
    	return matrix;
    }
}