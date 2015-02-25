import java.util.*;

public class Generate{
	public ArrayList<String> generateParenthesis(int n){
		ArrayList<String> list = new ArrayList<String>();

		rec(list,"",n,n);

		return list;

	}

	public void rec(ArrayList<String> list, String temp, int l, int r){

		if(l == 0 && r == 0){
			list.add(temp);
			return;
		}
		if(l > 0){
			rec(list,temp+"(", l-1, r);
		}

		if(l < r)
			rec(list,temp+")",l, r-1);


	}

	public static void main(String[] args){
		Generate g = new Generate();

		System.out.println(g.generateParenthesis(3));
	}
}