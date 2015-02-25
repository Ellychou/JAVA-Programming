import java.util.*;

public class PrintNtree {
	public static void print(Ntree node) {
		if(node == null) return;

		System.out.println(node.getVal());
		if(node.getChildren() == null) return;
		int len = node.getChildren().size();
		if(len > 0) {
			for(int i = 0; i < len ;i++){
				print(node.getChildren().get(i));
			}
			//System.out.println(node.getVal());
			
		}else{
			//System.out.println(node.getVal());
		}

		
			//for(Ntree child: node.children){
				//print(child);
			//}	
	}

	public static void main(String[] args){
			Ntree node = new Ntree(1);
			List<Ntree> child= new ArrayList<Ntree>();
			child.add(new Ntree(2));
			child.add(new Ntree(3));
			//node.children = child;
			
			node.addChildren(child);

			//Ntree child3 = new Ntree(4);
			List<Ntree> children3 = new ArrayList<Ntree>();
			//children3.add(new Ntree(5));
			//children3.add(new Ntree(6));
			//children.add(child3);
			
			print(node);

		}
				


}



class Ntree{
	private int val;
	private int size;
	private List<Ntree> children;
	Ntree(int x) { 
		val = x ;
		//children = child;
	}

	public int getVal() {
		return val;
	}

	public Ntree setVal(int val) {
		this.val = val;
		return this;
	}

	public Ntree addChildren(List<Ntree> children) {
		//if(size < K)
		this.children = children;// use add
		return this;
	}

	public List<Ntree> getChildren() {
		return children;
	}
	// remove 
}


