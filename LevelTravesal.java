import java.util.*;

public class LevelTravesal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) return result;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int cur = 1;
		int next = 0;

		while(!q.isEmpty()){
			
		    TreeNode tn = q.remove();
			temp.add(tn.val);
			cur--;
			
			if(tn.left != null) {
				q.add(tn.left);
				next++;
			}
			if(tn.right != null) {
				q.add(tn.right);
				next++;
			}


			if(cur == 0){
				result.add(temp);
				temp = new ArrayList<Integer>();
				cur = next;
				next = 0;
			}
		}
		return result;
	}

	public List<List<Integer>> levelOrderRec(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		levelOrderHelper(root, result, 1);
		return result;
	}

	public void levelOrderHelper(TreeNode tn, List<List<Integer>> result, int depth) {
		if (tn == null)
			return;
		List<Integer> tempSet;
		
		if (result.size() < depth) {	// add new set
			tempSet = new ArrayList<Integer>();
			result.add(tempSet);
		} else {
			tempSet = result.get(depth-1);
		}
		System.out.println(result.get(depth-1));
		tempSet.add(tn.val);
		System.out.println("temp"+ tempSet);
		levelOrderHelper(tn.left, result, depth+1);
		System.out.println("depleft"+ depth);
		levelOrderHelper(tn.right, result, depth+1);
		System.out.println("depright"+ depth);
	}

	public static void main(String[] args){
		TreeNode t = new TreeNode(3);
		t.left = new TreeNode(9);
		t.right = new TreeNode(20);
		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(7);

		LevelTravesal lt = new LevelTravesal();
		List<List<Integer>> res = lt.levelOrderRec(t);
		for(List<Integer> temp : res){
			System.out.println(temp);
		}

	}	
		




	
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}