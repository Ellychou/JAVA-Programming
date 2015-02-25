import java.lang.*;

public class IntegerRoman{
	public static String inToRoman(int num){
		String[] old = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] same = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < same.length; i++){
			while(num >= same[i]){
				result.append(old[i]);
				num -=same[i];
			}
		}
		return result.toString();

	}

	public static void main(String[] args){
		int num = 78;
		System.out.println(inToRoman(num));

	}
}