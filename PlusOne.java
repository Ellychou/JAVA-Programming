public class PlusOne {
	public static int[] plusOne(int[] digits) {
		if(digits == null || digits.length == 0) return digits;

		for(int i = digits.length - 1; i >= 0; i--) {
			digits[i] = digits[i] + 1;
			if(digits[i] == 10) {
				digits[i] = 0;
			}else{
				return digits;
			}
		}
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		return res;
 
	}
	public static void main(String[] args) {
		int[] d = {2,8,9};
		int[] r = plusOne(d);
		for(int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
		

	}
}