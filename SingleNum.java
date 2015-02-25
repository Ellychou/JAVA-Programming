public class SingleNum{
	public static int single(int[] a){
		int x = 0;
		for(int A: a){
			x ^= A;
			System.out.println(x);
		}
		return x;
	}

	public static void main(String[] args){
		int[] a = {1,2,3,1,2,3,4,4};
		int[] b = {3,4,5,2};
		System.out.println(single(b));
		//System.out.println(1^2);
		//System.out.println(3^3);

	}
}