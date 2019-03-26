/*
 * 归并排序
 */
public class Solution {
//	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		ListNode s = new ListNode(-1);
//		ListNode result = s;
//        while(true){
//        		if(l1.val > l2.val){
//        			result.next = new ListNode(l2.val);
//        			l2 = l2.next;
//        		}
//        		else{
//        			result.next = new ListNode(l1.val);
//        			l1 = l1.next;
//        		}
//        		result = result.next;
//        	
//        		if(l1==null) {
//        			result.next = l2;
//        			return s.next;
//        		}
//        		else if(l2==null){
//        			result.next = l1;
//        			return s.next;
//        		}
//        }
//    }
	
	//递归写法更简洁
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
 
        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
}    

}
