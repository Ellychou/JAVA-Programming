import java.util.*;

public class Permutations{
	// public ArrayList<ArrayList<Integer>> permute(int[] num) {
	// 	if(num == null || num.length == 0){
	// 		return null;
	// 	}

	// 	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	// 	ArrayList<Integer> temp = new ArrayList<Integer>();

	// 	helper(num,result,temp);

	// 	return result;


	// }

	// public void helper(int[] num, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp){

	// 	if(temp.size()==num.length){
	// 		result.add(new ArrayList<Integer>(temp));
	// 		return;
	// 	}
	// 	for(int i = 0; i < num.lengths; i++){
	// 		if(temp.contains(num[i])){
	// 			continue;
	// 		}

	// 		temp.add(num[i]);
	// 		helper(num,result,temp);
	// 		temp.remove(temp.size()-1);
	// 	}



	// 	}

	public ArrayList<ArrayList<Integer>> permuteII (int[] num) {
		if(num == null || num.length == 0){
			return null;
		}

		HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();

		boolean[] visited = new boolean[num.length];

		helper(num,result,temp,visited);

		return new ArrayList<ArrayList<Integer>>(result);
		


	}

	public void helper(int[] num, HashSet<ArrayList<Integer>> result, ArrayList<Integer> temp, boolean[] visited){

		if(temp.size()==num.length){
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		for(int i = 0; i < num.length; i++){
			if(!visited[i]){
				temp.add(num[i]);
				visited[i] = true;
				helper(num,result,temp,visited);
				temp.remove(temp.size()-1);
				visited[i] = false;

			}
		}


	}

	public static void main(String[] args){
		Permutations p = new Permutations();
		int[] num = new int[]{1,1,2};
		ArrayList<ArrayList<Integer>> res = p.permuteII(num);
		for(int i = 0 ; i < res.size(); i++){
			System.out.println(res.get(i));
		}
	
	}
}