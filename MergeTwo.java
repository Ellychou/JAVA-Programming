public class MergeTwo {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        ListNode fakehead = new ListNode(0);
        ListNode p = fakehead;
        
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                p.next = p1;//new ListNode(p1.val);

                p = p.next;
                p1 = p1.next;
            }else{
                p.next = p2;//new ListNode(p2.val);
                p = p.next;
                p2 = p2.next;
            }
        }
        
        if(p1 == null)
            p.next = p2;
        if(p2 == null)
            p.next = p1;
        
        //fakehead.next = p;
        
        return fakehead.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(6);

        MergeTwo  mergetwo = new MergeTwo();
        ListNode merge = mergetwo.mergeTwoLists(l1,l2);

        while(merge != null){
            System.out.println(merge.val);
            merge = merge.next;
            
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