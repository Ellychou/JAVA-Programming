public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return helper(root.left,root.right);

	}
	public boolean helper(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		if(left == null || right == null) return false;
		if(left.val != right.val) return false;
		return helper(left.left, right.right) && helper(left.right, right.left);
	}
	public boolean symmetric(TreeNode root) {
		if(root == null) return true;
		if(root. == null && root.right == null) return true;

		Queue<TreeNode> leftq = new LinkedList<TreeNode>();
		Queue<TreeNode> rightq = new LinkedList<TreeNode>();
		leftq.offer(root.left);
		rightq.offer(root.right);

		while(!leftq.isEmpty() && !rightq.isEmpty()) {
			TreeNode l = leftq.poll();
			TreeNode r = rightq.poll();
			if (l == null && r == null) continue;
			if (l == null || r == null) return false;
			if (l.val != r.val) return false;

			leftq.offer(l.left);
			rightq.offer(r.right);
			leftq.offer(r.left);
			rightq.offer(l.right);

		}
		return true;


	}
}