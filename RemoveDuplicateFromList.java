import java.util.*;

public class RemoveDuplicateFromList {
	public  static ListNode deleDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode p = head;
		ListNode n = head.next;
		while(n != null ){
			if(p.val == n.val){
				p.next = n.next;
				n = n.next;
			} else {
				p = p.next;
				n = n.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		ListNode res = deleDuplicates(head);
		while(res.next != null){
			//System.out.println(res.val);
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

