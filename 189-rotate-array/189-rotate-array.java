class Solution {
    public void rotate(int[] arr, int r) {
        r = r % arr.length;
		if (r < 0) {
			r = r + arr.length;
		}

		int[] na = new int[arr.length];

		for (int i = 0; i < na.length; i++) {

			if (i < r) {
				na[i] = arr[i + na.length - r];
			} else {
				na[i] = arr[i - r];
			}
		}

	    for(int i=0;i<arr.length;i++){
            arr[i]=na[i];
        }
    }
}