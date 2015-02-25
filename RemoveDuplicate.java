public class RemoveDuplicate {
	public static int removeDuplicates(int[] A) {
		if(A.length < 2) return A.length;
		int duplicate = 0;
		for(int i = 0; i < A.length - 1; i++) {
			if(A[i] == A[i+1]) {
				duplicate++;
			}
		}
		return A.length-duplicate;
	}

	public static int remove(int[] A){
		if(A.length < 2) return A.length;
		int i = 0;
		int j = 1;

		while(i<A.length && j < A.length) {
			if(A[i] == A[j]){
				j++;
			}else{
				i++;
				A[i] = A[j];
				j++;
			}
		}
		return i+1;

	}

	public static void main(String[] args) {
		int[] a = {1,2,2,3,3};

		System.out.println(remove(a));
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		

	}
}