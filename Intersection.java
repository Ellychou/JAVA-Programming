public class Intersection {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		int lenA = getLen(headA), lenB = getLen(headB);
		if (lenA > lenB) {
			while (lenA > lenB) {
				headA = headA.next;
				lenA--;
			}
		}else{
			while (lenB > lenA) {
				headB = headB.next;
				lenB--;
			}
		}

		while (headA != null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}
	public int getLen(ListNode head) {
		int len = 0;
		while(head != null) {
			len++;
			head = head.next;
		}
		return len;
	}
}
class LisNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;	
	}
}