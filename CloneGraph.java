public class CloneGraph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		UndirectedGraphNode copy = new UndirectedGraphNode(node.val);
		queue.add(node);
		map.put(node,copy);

		while (!queue.isEmpty()) {
			UndirectedGraphNode out = queue.poll();
			UndirectedGraphNode outCopy = map.get(out);

			for (UndirectedGraphNode nei : out.neighbors) {
				if(!map.containsKey(nei)) {
					UndirectedGraphNode neiCopy = new UndirectedGraphNode(nei.val);
					map.put(nei,neiCopy);
					outCopy.neighbors.add(neiCopy);
					queue.add(nei);
				}else{
					outCopy.neighbors.add(map.get(nei));
					
				}
			}
		}
		return copy;

	}
}
class UndirectedGraphNode {
	int lable;
	List<UndirectedGraphNode> neighbors;
	UndirectedGraphNode(int x) {
		lable = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}