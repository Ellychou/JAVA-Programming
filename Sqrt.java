public class Sqrt{
	public static int sqrt(int x) {
		if(x == 0)
			return 0;
		int r = x/2 + 1;

		int l = 1;

		while(l<=r){
			int m = (r + l)/2;
			
			if(m == x/m){
				return m;
			}else if(x/m < m){
				r = m -1;
			}else{
				l = m+1;
			}
		}
		return r;
	}
	public static void main(String[] args){
		int x = 2;

		System.out.println(sqrt(x));

	}
	
}