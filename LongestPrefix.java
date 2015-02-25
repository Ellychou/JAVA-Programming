public class LongestPrefix {
	public static int minLen(String[] strs){
		int min = strs[0].length();
		for(int i = 1; i < strs.length; i++){
			if(strs[i].length() < min){
				min = strs[i].length();
			}
		}
		return min;
	}
	public  static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
		int min = minLen(strs);
		int j = 0;
		StringBuilder res = new StringBuilder();
		while(j < min){
			for(int i = 1; i < strs.length; i++){
				if(strs[i].charAt(j) != strs[0].charAt(j)){
					return res.toString();
				}
			}
			res.append(strs[0].charAt(j));
			j++;
		}
		return res.toString();
	}

	public static String longest2(String[] strs){
		if(strs == null || strs.length == 0) return "";
		for(int i = 0; i < strs[0].length(); i++){
			char x = strs[0].charAt(i);
			for(int j = 0; j < strs.length; j++){
				if(strs[j].length() == i || strs[j].charAt(i) != x){
					return strs[0].substring(0,i);
				}
			}
		}
		return strs[0];


	}
	public static void main(String[] args){
		String[] strs = {"abcdeimhf","abchos","abkor","abli"};
		System.out.println(longestCommonPrefix(strs));
		System.out.println(longest2(strs));

	}
}