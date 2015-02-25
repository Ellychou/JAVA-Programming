import java.util.*;

public class MajorityElement {
	public static int majorityElement(int[] num) {

		int n = num.length;
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int target = 0;
		for(int i = 0; i < n; i++) {
			target = num[i];
			if(map.containsKey(target)) {
				map.put(target, map.get(target)+1);
			}else{
				map.put(target, 1);
			}
		}
		Iterator<Map.Entry<Integer,Integer>> i = map.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer,Integer> e = i.next();
			if(e.getValue() > n/2) {
				return e.getKey();
			}
		}
		// for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
		// 	if (entry.getValue() > n/2) {
		// 		return entry.getKey();
		// 	}
		// }
		return 0;
	}

	public static void main(String[] args) {

		int[] num = {1,1,1,1,2,3,4,5,1};
		System.out.println(majorityElement(num));
	}
}