
public class Solution {
//	public ListNode deleteDuplicates(ListNode head) {
//        ListNode ans = head;
//        if(head == null || ans.next == null) return head;
//        while(true){
//            if(ans.val == ans.next.val){
//                ListNode n1 = ans.next.next;
//                ans.next = n1;
//            }
//            if(ans.next != null && ans.val == ans.next.val) continue;
//            else if(ans.next != null && ans.next.next != null) ans = ans.next;
//            else break;
//        }
//        return head;
//    }
	/**
	 * 递归套路解决链表问题：

		1. 找终止条件：当head指向链表只剩一个元素的时候，自然是不可能重复的，因此return
		2. 想想应该返回什么值：应该返回的自然是已经去重的链表的头节点
		3. 每一步要做什么：宏观上考虑，此时head.next已经指向一个去重的链表了，而根据第二步，
		   我应该返回一个去重的链表的头节点。因此这一步应该做的是判断当前的head和head.next是否相等，
		   如果相等则说明重了，返回head.next，否则返回head
	 * @param head
	 * @return
	 */
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val) head = head.next;
        return head;
    }
}
