public class SameTree{
	public boolean isSameTree(TreeNode p, TreeNode q){
		if(p == null && q == null){
			return true;
		}else if(p == null || q == null){
			return false;
		}
		if(p.val != q.val){
			return false;
		}else{
			return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
		}
	}
	public boolean isSameTree(TreeNode p, TreeNode q){

		LinkedList<TreeNode> tree1 = new LinkedList<TreeNode>();
		LinkedList<TreeNode> tree2 = new LinkedList<TreeNode>();
		tree1.offer(p);
		tree2.offer(q);

		while(tree1.size() != 0 && tree2.size() != 0){
			TreeNode out1 = tree1.pop();
			TreeNode out2 = tree2.pop();

			if(out1 == null && out2 == null) return true;
			if(out1 == null || out2 == null) return false;
			if(out1.val != out2.val) return false;

			tree1.offer(out1.left); tree1.offer(out1.right);
			tree2.offer(out2.left); tree2.offer(out2.right);
		}
		if(left.size() != 0 || right.size() != 0) return false;

		return true;
	}
}