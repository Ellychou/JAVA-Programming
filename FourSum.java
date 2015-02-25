import java.util.*;

public class FourSum{
	public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {

		Arrays.sort(num);
		HashSet<ArrayList<Integer>> visited = new HashSet<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for(int i = 0; i < num.length-3; i++){
			for(int j = i+1; j < num.length-2; j++){
				int k = j+1, l = num.length - 1;
				while(k<l){
					int sum = num[i]+num[j]+num[k]+num[l];
					if( sum > target){
						l--;
					}else if(sum < target){
						k++;
					}else{
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[k]);
						temp.add(num[l]);

						if(!visited.contains(temp)){
							result.add(temp);
							visited.add(temp);
						}

						k++;
						l--;
					}
				}


			}
		}

		return result;
	}

	public static void main(String[] args){
		int[] num = new int[]{1, 0, -1, 0, -2, 2};
		int target = 0;


		ArrayList<ArrayList<Integer>> result = fourSum(num,target);
		System.out.println(result.size());
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}