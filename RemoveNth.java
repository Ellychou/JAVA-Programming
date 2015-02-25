public class RemoveNth{
	public static ListNode removeNthFromEnd(ListNode head, int n){
		if(head == null) return null;
		if(n == 0) return head;
		ListNode faster = head;
		ListNode slower = head;

		for(int i = 0; i < n; i++){
			faster = faster.next;
		}
		if(faster == null){
			head = head.next;
			return head;
		}
		while(faster.next != null){
			slower = slower.next;
			faster = faster.next;
		}

		slower.next = slower.next.next;

		return head;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode res = removeNthFromEnd(head,2);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
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