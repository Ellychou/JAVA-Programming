public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if(x < 0) return false;
		int div = 1;
		while(x/div >= 10){
			div *= 10;
		}
		int begin, end;
		while(x >0){
			begin = x/div;
			end = x % 10;
			if(begin != end) return false;
			x = (x%div)/10;
			div /= 100;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(1223221));
		System.out.println(isPalindrome(243));		
	}
}