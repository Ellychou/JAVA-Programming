import java.util.*;

public class MergeK{
	public static ListNode mergeKlists(List<ListNode> lists){
		if(lists.size()== 0)
			return null;

		PriorityQueue <ListNode> p = new PriorityQueue<ListNode>(lists.size(),
			new Comparator<ListNode>(){
				@Override
				public int compare(ListNode a, ListNode b){
					return a.val - b.val;
				}

		});

		for(ListNode list: lists){
			if(list != null)
				p.add(list);
		}
		
		ListNode head = new ListNode(0);
		ListNode result = head;
		
		while(p.size() > 0){
			ListNode temp = p.poll();
			result.next = temp;

			if(temp.next!=null){
				p.add(temp.next);
			}

			result = result.next;
		}
		return head.next;



	}

	public static void main(String[] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		ListNode l3 = new ListNode(3);
		l3.next = new ListNode(9);
		List<ListNode> list = new LinkedList<ListNode>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		ListNode result = mergeKlists(list);
		while(result.next!=null){
			System.out.println(result.val);
			result = result.next;
		}
		

	}
}






class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
        val = x;
         next = null;
  	}
}