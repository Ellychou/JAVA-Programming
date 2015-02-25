public class BalancedTree{
	public boolean isBalanced(TreeNode root) {
		if (root == null) return true;

		if(Math.abs(getDepth(root.left) - getDepth(root.right)) > 1)
			return false;
		return isBalanced(root.left) && isBalanced(root.right);

	}
	public int getDepth(TreeNode root){
		if (root == null) return 0;
		
		return Math.max(getDepth(root.left),getDepth(root.right))+1;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		BalancedTree tree = new BalancedTree();
		System.out.println(tree.isBalanced(root));
	}
	
}