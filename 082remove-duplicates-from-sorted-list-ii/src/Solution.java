class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null) return head;      
//        ListNode n1 = new ListNode(0);
//        ListNode p1 = head;
//        ListNode p2 = n1;
//        n1.next = head;
//        while(p1.next!=null){
//            ListNode temp = getNextDifferentNode(p1);
//            if(temp != null){
//                p2.next = temp.next;
//                if(p2.next==null || p2.next.next==null)
//                    return n1.next;
//                else
//                    p1 = p2.next;
//            }
//            else{
//                p2 = p2.next;
//                p1 = p1.next;
//            }
//        }
//        return n1.next;
//    }
//    
//    public ListNode getNextDifferentNode(ListNode n){
//        if(n==null || n.next==null) return null;
//        boolean find = false;
//        while(n!=null && n.next!=null){
//            if(n.val == n.next.val){
//                find = true;
//                n = n.next; 
//            }
//            else
//                break;
//        }
//        if(find == false) return null;
//        else return n;
//    }
	
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.val == head.next.val){
            ListNode nextNode = head.next;
            do
            {
                nextNode=nextNode.next;
            }
            while(nextNode!=null&&nextNode.val==head.val);
            return deleteDuplicates(nextNode);
        }
        else {
            head.next=deleteDuplicates(head.next);
            return head;
        }
    }
}