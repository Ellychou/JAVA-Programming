public class SwapNodes.java{
	public ListNode swapPairs(ListNode head) {
		if(head == null){
			return null;
		}

		ListNode fake= new ListNode(0);
		fake.next = head;
		ListNode p1 = fake;
		ListNode p2 = head;

		while(p1.next = null && p2.next = null){
			ListNode temp = p2.next.next;
			p2.next.next = p1.next;
			p1.next = p2.next;
			p2.next = temp;
			p1 = p2;
			p2 = p1.next;

		}

		return fake.next;

	}
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}