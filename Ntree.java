public class PrintNtree {
	public static void print(Ntree node) {
		if(node == null) return;
		System.out.println(node.val);

		
			for(Ntree child: node.children){
				print(child);
			}	
	}

	public static void main(String[] args){
			Ntree node = new Ntree(1);
			List<Ntree> children = new ArrayList<Ntree>();
			children.add(new Ntree(2));
			children.add(new Ntree(3));
			Ntree child3 = new Ntree(4);
			List<Ntree> children3 = new ArrayList<Ntree>();
			children3.add(new Ntree(5));
			children3.add(new Ntree(6));
			children.add(child3);

			print(node);

		}
				


}



class Ntree{
	int val;
	List<Ntree> children;
	Ntree(int x) { 
		val = x ;
		//children = new List<Ntree>();
	};
}