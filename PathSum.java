public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum){
		if(root == null)
			return false;
		if(root.right == null && root.left == null && root.val == sum)
			return true;
		return hasPathSum(root.right,sum-root.val) || hasPathSum(root.left, sum-root.val);
	}
	public boolean hasPathSum(TressNode root, int sum){
		if(root == null) return false;
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(root);
		int total = root.val;

		while(!st.empty()){
			if(root.right == null && root.left == null && total == sum)
				return true;
			if(root.left != null){
				root = root.left;
				st.push(root);
				total += root.val;
			else{
				TreeNode out = st.pop();
				total -= out.val;
				root = st.peek();	
				if(root.right!=null){
					root = root.right;
					st.push(root);
					total += root.val;
				}else{
					TreeNode out = st.pop();
					total -= out.val;
					root = st.peek();	
				}
			}


		}


	}
}