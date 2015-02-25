import java.util.*;

public class PalindromePartitioning {
	public ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if(s == null || s.length()==0) return result;

		ArrayList<String> list = new ArrayList<String>();
		addPalindrome(s,list, result);
		return result;
    }

    public void addPalindrome(String str, ArrayList<String> list, ArrayList<ArrayList<String>> result) {
    	int len = str.length();
    	if(len == 0){
    		result.add(new ArrayList<String>(list));
    		return;
    	}

    	for(int i = 1; i <= len; i++) {
    		String start = str.substring(0, i);
    		if(isPalindrome(start)){
    			list.add(start);
    			String substr = str.substring(i);
    			addPalindrome(substr,list,result);
				list.remove(list.size()-1);
    			//list.clear();
    		}
    	}

    }
    public boolean isPalindrome(String s) {
		s = s.replaceAll("[^\\w]","").toLowerCase();
		int l = s.length();

		for(int i = 0; i < l/2; i++){
			if(s.charAt(i) != s.charAt(l-i-1)){
				return false;
			}

		}

		return true;
	}

	public static void main(String args[]){
		System.out.println(Integer.MIN_VALUE);
		PalindromePartitioning p = new PalindromePartitioning();
		ArrayList<ArrayList<String>> res = p.partition("aabbc");
		for(int i = 0; i < res.size(); i++){
			System.out.println(res.get(i));
		}
	}
}