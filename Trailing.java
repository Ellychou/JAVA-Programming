public class Trailing{
	public int trailingZeroes(int n) {
		if(n <= 0) return -1;
		int res = 0;
		for(int i = 5; n/i >= 1; i*=5) {
			res += n/i;
		}
		return res;
	}
}