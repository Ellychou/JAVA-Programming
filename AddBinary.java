import java.util.*;

public class AddBinary{
	public static String addBinary(String a, String b) {
		int m = a.length();
		int n = b.length();
		int j = Math.max(m,n);
		int current = 0;
		StringBuilder result = new StringBuilder();
		

		for( int i = 0; i < j; i++){
			int p = 0, q = 0, temp = 0;
			if(i < m){
				p = a.charAt(m-1-i)-'0';
			}else{
				p = 0;
			}

			if(i < n){
				q = b.charAt(n-1-i)-'0';
			}else{
				q = 0;
			}

			temp = p + q + current;
			current = temp/2;
			result.insert(0, temp%2);
		}
		String res = result.toString();
		return (current == 0)? res : '1'+res;
	}



	public static void main(String[] args){
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a,b));

	}
	
}