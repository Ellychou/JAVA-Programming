import java.util.*;

public class Anagrams{
	public static ArrayList<String> anagrams(String[] strs) {

		ArrayList<String> result = new ArrayList<String>();

		if(strs == null || strs.length == 0)
			return null;

		HashMap<String, ArrayList<String>> hp = new HashMap<String, ArrayList<String>>();

		for(String s : strs){
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String tempstr = String.valueOf(temp);
			if(hp.containsKey(tempstr)){
				hp.get(tempstr).add(s);
			}else{
				ArrayList<String> value = new ArrayList<String>();
				value.add(s);
				hp.put(tempstr,value);
			}
		}

		for(ArrayList<String> a: hp.values()){
			if(a.size() > 1)
				result.addAll(a);
		}

		return result;
		
		// Iterator<Map.Entry<String,ArrayList<String>>> iter = hp.entrySet().iterator();
		// while(iter.hasNext()){
		// 	Map.Entry<String, ArrayList<String>> entry = iter.next();
		// 	ArrayList<String> item = entry.getValue();
		// 	if(item.size() > 1){
		// 		result.addAll(item);
		// 		System.out.println(result);
		// 	}
		// }
		// return result;
	}

	public static void main(String[] args){
		String[] strs = {"abc","cde","cba","abcde","decab","bcdea"};
		
		System.out.print(anagrams(strs));
	}
}