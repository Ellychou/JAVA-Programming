public class BST{
	public boolean isValidBST(TreeNode root){

		return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	public boolean valid(TreeNode root, int min, int max){
		if(root == null)
			return true;

		if(root.val <= min || root.val >= max)
			return false;

		return valid(root.left,min,root.val) && valid(root.right,root.val,max);

	}

	public static void main(String[] args) {

		TreeNode tree = new TreeNode(5);
		TreeNode l1 = new TreeNode(4);
		TreeNode r1 = new TreeNode(6);
		TreeNode r2 = new TreeNode(3);


		tree.left = l1;
		tree.right = r1;
		tree.right.left = r2;

		BST bst = new BST();
		boolean val = bst.isValidBST(tree);
		System.out.println(val);

		
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){ val = x;}
}