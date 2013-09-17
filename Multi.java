class Multi {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4,  5},
					  { 6, 7, 8, 9, 10},
					  {11,12,13,14, 15} };
		// System.out.println(sumRow(a,0));
		// System.out.println(sumCol(a,0));
		// System.out.println(sumTotal(a));
		reverseRow(a,0);
	}
	public void print(int[][] a){
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}
	}
	public static int sumRow(int[][] a, int n){
		int sum = 0;
		for (int c=0; c<a[n].length; c++) {
			sum += a[n][c];
					
		}
		return sum;
	}
	public static int sumCol(int[][] a, int n){
		int sum = 0;
		for (int r=0; r<a.length; r++) {
			sum+= a[r][n];
		}
		return sum;
	}
	public static int sumTotal(int[][] a){
		int sum = 0;
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sum += a[r][c];
				
			}
			
		}
		return sum;
	}
	public static void reverseRow(int[][] a, int n){
		int[] b = new int[a[n].length];
		for (int c = a[n].length-1, k = 0; c>=0; c--, k++) {
			b[k] = a[n][c]; 
			
		}
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public static void snakeDraft(int p, int r){
		int[][] a = new int[r][p];
		for (int c = 0; c<r; c+=2) {
			for (int i = 0; i<p; i++) {
				a[r][i] = i;
			
			}
		}
		for(int x = 1; x<r; x+=2){
			for (int c = a[n].length-1, k = 0; c>=0; c--, k++) {
			b[k] = a[n][c]; 
			
			}
		}
	}
}




















