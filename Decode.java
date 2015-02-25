import java.util.*;
import java.lang.Integer;

public class Decode{
	public int numDecodings(String s) {
		if(s==null || s.length()== 0)
			return 0;
		if(s.charAt(0)=='0')
			return 0;
		int len = s.length();
		int[] num = new int[len+1];
		num[0] = 1;
		num[1] = 1;
		int value;

		for(int i = 2; i <=len; i++){
			value = Integer.parseInt(s.substring(i-1,i));
			if(value != 0){
				num[i] = num[i-1];
			}
			if(s.charAt(i-2)!='0') {
				value = Integer.parseInt(s.substring(i-2,i));
				if(value > 0 && value <=26) {
					num[i] += num[i-2];
				}
			}

		}
		return num[len];
	}
}