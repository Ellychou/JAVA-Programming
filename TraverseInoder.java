import java.util.*;

public class TraverseInoder{
	public static ArrayList<Integer> inorderTraversal(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();

		Stack<TreeNode> stack = new Stack<TreeNode>();

		

		while(!stack.empty() || root != null){
			
			if(root != null){
				stack.push(root);
				root = root.left;			
			
			}else{
				TreeNode temp = stack.pop();
				result.add(temp.val);
				root = temp.right;
			}

		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args){
		TreeNode r = new TreeNode(7);
		//r.left = new TreeNode(5);
		// r.right = new TreeNode(8);
		// r.left.left = new TreeNode(4);
		// r.left.right = new TreeNode(6);
		// r.right.right = new TreeNode(10

		System.out.println(inorderTraversal(r));

	}
}





	// //	ArrayList<Integer> result = new ArrayList<Integer>();
	// // 	 rec(root, result);
	// // 	 return result;
	// // }

	// // public void rec(TreeNode root, ArrayList<Integer> result){
	// // 	if(root == null)
	// // 		return;
	// // 	rec(root.left, result);
	// // 	result.add(root.val);
	// // 	rec(root.right, result);
	// // }

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}