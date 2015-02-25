public class MergeArray {

	public static void merge(int A[], int m, int B[], int n) {

		int k = m+n-1;
		int i = m-1;
		int j = n - 1;

		for(;i >= 0 && j >= 0; k--){
			if(A[i] >= B[j]){
				A[k] = A[i];
				i--;
			}else{
				A[k] = B[j];
				j--;
			}
		}
		while(j >= 0){

			A[k] = B[j];

			k--;
			j--;		
		}

	}

	public static void main(String[] args){
		int[] a = {1,4,7,8};
		int[] b = {2,3,5};

		//merge(a,4,b,3);
		String s = "aBs 2!9b";
		s=s.replaceAll("[^\\w]","");
		for(int i = 0; i < s.length(); i++){
			System.out.println(s.charAt(i));
		}
		
	}
}