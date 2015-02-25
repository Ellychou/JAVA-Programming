import java.util.*;

public class RomanInteger{
	public static int romanToInt(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('M',1000);
		map.put('D',500);
		map.put('C',100);
		map.put('L',50);
		map.put('X',10);
		map.put('V',5);
		map.put('I',1);

		char[] temp = s.toCharArray();
		int result = 0;
		int i = 0;
		while(i < temp.length){
				if(i == temp.length - 1){
					result += map.get(temp[i]);
					break;
				}				
				if(map.get(temp[i]) >= map.get(temp[i+1])){
					result += map.get(temp[i]);
					i++;
				}else{
					result += (map.get(temp[i+1]) - map.get(temp[i]));
					i += 2;
				}


			}

		
		return result;
	}

	public static void main(String[] args){
		String s = "MDCCC";

		System.out.println(romanToInt(s));
	}
}