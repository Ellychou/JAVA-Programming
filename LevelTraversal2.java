/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 */
import java.util.*;
public class LevelTraversal2 {
	public ArrayList<ArrayList<Integer>> levelOrderBottom1(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) return result;
		Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		queue.offer(root);

		while(!queue.isEmpty() ) {
			TreeNode  t = queue.poll();
			temp.add(t.val);
			if(t.left != null) q2.add(t.left);
			if(t.right != null) q2.add(t.right);

			System.out.println(q2);
			if(queue.size() == 0){
				while(!q2.isEmpty()){
					queue.offer(q2.poll());
				}
				stack.push(new ArrayList<Integer>(temp));
				temp.clear();
			}
		}
		while(stack.size() != 0){
			result.add(stack.pop());
		}	
		return result;
	}
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) return result;
		helper(root,result,1);
		return result;
	}

	public void helper(TreeNode root, ArrayList<ArrayList<Integer>> res, int depth){
		if(root == null) return;
		ArrayList<Integer> temp;
		if(res.size() < depth){			
			temp = new ArrayList<Integer>();
			res.add(0,temp);
		} else {
			temp = res.get(res.size() - depth);
		}
		for(int i = 0; i < temp.size(); i++){
			System.out.println(temp.get(i));
		}
		for(int i = 0; i < res.size(); i++){
			System.out.println(res.get(i));
		}
		temp.add(root.val);
		helper(root.left,res,depth+1);
		helper(root.right,res,depth+1);
	}


	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		LevelTraversal2 lt = new LevelTraversal2();
		ArrayList<ArrayList<Integer>> res = lt.levelOrderBottom(root);
		for(ArrayList a : res) {
			System.out.println(a);
		}
	}	
}


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
}