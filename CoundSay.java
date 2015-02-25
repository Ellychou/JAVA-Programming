public class CoundSay {
	public static String countAndSay(int n) {
		if(n == 1) return "1";
		String s = "1";
		for (int i = 1; i < n; i++){
			int count = 1;
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j < s.length(); j++) {
				if(s.charAt(j) == s.charAt(j-1)) {
					count++;
				}else{
					sb.append(count).append(s.charAt(j-1));
					count = 1;
				}
			}
			sb.append(count).append(s.charAt(s.length()-1));
			s = sb.toString();
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(2));
	}
}