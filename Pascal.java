import java.util.*;
public class Pascal {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows == 0) return res;
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		res.add(temp);
		if(numRows == 1) return res;
		for (int i = 2; i <= numRows; i++) {
			List<Integer> cur = new ArrayList<Integer>();
			cur.add(1);
			for(int j = 0; j < temp.size()-1; j++) {
				cur.add(temp.get(j)+temp.get(j+1));

			}
			cur.add(1);
			res.add(cur);
			temp = cur;
		}
		return res;
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		for (int i = 0; i < rowIndex; i++) {
			for(int j = res.size()-2; j >= 0; j--) {
				res.set(j+1, res.get(j)+res.get(j+1));
			}
			res.add(1);
		}
		return res;
	}




	public static void main(String[] args) {
		for (List<Integer> l : generate(1)) {
				System.out.println(l);
		}
		System.out.println(getRow(3));

	}
}