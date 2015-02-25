public class ExcelColumn {
	public static int titleToNumber(String s) {
		if(s == null || s.length() == 0) return 0;
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			int last = (int)s.charAt(i) - 64;
			num = num*26 + last;
		}
		return num;
	}

	public static String convertToTitle(int n) {
		if(n == 0) return "";
		StringBuilder s = new StringBuilder();
		
		while(n > 0){
			int reminder = n%26;
			n = n/26;
			if(reminder == 0) {
				s.insert(0,'Z');
				n--;
			}else{
				s.insert(0,(char)('A' + reminder - 1));
			}
		}
		return s.toString();
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("AZ"));
		char a = (char)('A' + 1);
		System.out.println(a);
		System.out.println(convertToTitle(28));
	}
}