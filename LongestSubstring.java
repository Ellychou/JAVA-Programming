import java.util.*;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		char[] arr = s.toCharArray();
		int pre = 0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();

		for(int i = 0; i < arr.length; i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i],i);
			}else{
				pre = Math.max(pre,map.size());
				i = map.get(arr[i]);
				map.clear();
			}

		}

		return Math.max(pre,map.size());
	
	}
	public static int solution2(String s){
		boolean[] check = new boolean[265];
		int pre = 0;
		int length = 0;
		char[] arr = s.toCharArray();

		for(int i = 0; i < arr.length; i++){
			char c = arr[i];
			if(check[c]){
				length = Math.max(length,i-pre);
				for(int j = pre; j < i; j++){
					if(arr[j] == c){
						pre = j+1;
						break;
					}else{
						check[c] = true;

					}
				}
			}else{
				check[c] = true;
			}
		}
		return Math.max(arr.length-j,result);

	}
	public static void main(String[] args){
		System.out.println(lengthOfLongestSubstring("abcdabca"));

	}
}