public class UniqueBinary {
	public static int numTrees(int n) {
		if(n == 0 || n == 1) return 1;
	
		int[] res = new int[n+1];

		for(int i = 2; i < n+1; i++){
			for(int j = 1; j <= i; j++){
				res[i] += res[i-j] * res[j-1];
			}
		}

		return res[n];
	}
	public static void main(String[] args) {
		System.out.println(numTrees(3));

	}
}