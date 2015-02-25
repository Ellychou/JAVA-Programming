public class RemoveElement {
	public static int removeElement(int[] A, int elem) {
		if(A.length == 0) return 0;

		int i = 0; int j = 0;
		while(i<A.length) {
			if(A[i] != elem){
				A[j] = A[i];
				j++;
			}
			i++;

		}
		return j;	
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 2, 3};
		//System.out.println(removeElement(a,2));
		String s = "Ab";
		int i = (int)s.charAt(0) - 64;
		System.out.println(i);
	}
}