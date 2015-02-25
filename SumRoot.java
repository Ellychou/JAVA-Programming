import java.util.*;

public class SumRoot{

	public int sumNumbers(TreeNode root){
		if(root == null) return 0;
		return helper(root,0);
	}

	public int helper(TreeNode node, int sum){
		if(node == null) return 0;
		int res = sum*10 + node.val;

		if(node.left == null && node.right == null) return res;

		return helper(node.left,res)+helper(node.right,res);
	}

	public static void main(String[] args){
		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(9);
		t.right = new TreeNode(0);
		t.left.right = new TreeNode(1);

		SumRoot sr = new SumRoot();
		System.out.println(sr.sumNumbers(t));
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}