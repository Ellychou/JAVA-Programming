public class LastWord {
	public static int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0) return 0;
		s = s.trim();
		String[] arr = s.split(" ");
		int res = arr[arr.length-1].length();
		return res;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" hello how are you"));
	}
}