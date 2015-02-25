import java.util.*;
public class MaxTree{
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
		pre.add(root);
		int depth = 0;

		while(!pre.isEmpty()){
			ArrayList<TreeNode> cur = new ArrayList<TreeNode>();
			for(TreeNode node: pre){
				if(node.left!=null) cur.add(node.left);
				if(node.right!=null) cur.add(node.right);
			}
			pre = new ArrayList<TreeNode>(cur);
			depth++;
		}
		return depth;
	}

	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.left.right = new TreeNode(7);

		System.out.println(maxDepth(root));

	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
}