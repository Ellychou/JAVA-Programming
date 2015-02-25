public class Subset{

	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		res.add(temp);
		Arrays.sort(S);
		helper(res,temp,S,p);
		return res;

		
	}
	public void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> temp,int[] S, int p){

		for(int i = 0; i < S.size; i++){
			temp.add(S[i]);
			helper(res,temp,S,p)
		}

	}
}
