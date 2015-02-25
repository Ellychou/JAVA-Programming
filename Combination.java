import java.util.*;
public class Combination{
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int count = 0;
		int start = 1;
		helper(count,start, n, k, temp, result);
		return result;
	}
	public void helper(int count, int start,int n, int k, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> result){
		if(count == k){
			ArrayList<Integer> sub = new ArrayList<Integer>(temp);
			result.add(sub);
			return;
		}

		for(int i = start; i <=n;i++){
			temp.add(i);
			helper(count+1,i+1,n,k,temp,result);
			temp.remove(temp.size()-1);
		}
	}

	public static void main(String[] args){
		Combination c = new Combination();
		ArrayList<ArrayList<Integer>> res = c.combine(4,3);
		for(int i = 0 ; i < res.size(); i++){
			//System.out.println(res.get(i));
		}

	}
}