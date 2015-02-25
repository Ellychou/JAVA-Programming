public class Radix {
	public static String convertRadix(int V, int R) {
		if(V < 0 || R < 2 || R > 36 || V < R) return null;
		int mod = 0;
		StringBuilder sb = new StringBuilder();
		char c;
		while (V > R) {
			mod = V % R;
			if (mod >= 10) {
				c = (char)((mod-10) + 'a');
				sb.append(c);
			}else{
				//c = (char)(mod);
				sb.append(mod);
			}
			
			V = V/R;
			System.out.println("sb= " + sb.toString());

		}
		sb.append(V);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(convertRadix(33,17));
		System.out.println(convertRadix(170,7));

	}
}