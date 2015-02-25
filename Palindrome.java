public class Palindrome{

	public static boolean isPalindrome(String s) {
		s = s.replaceAll("[^\\w]","").toLowerCase();
		int l = s.length();

		for(int i = 0; i < l/2; i++){
			if(s.charAt(i) != s.charAt(l-i-1)){
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args){
		String s = "aB!c1 C*ba";
		String b = "24acdcA34";

		boolean a = isPalindrome(b);

		System.out.println(a);

	}
}