
//注意链表交换节点之前节点的连接即可
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode result = ans;
        ans.next = head;
        while(ans.next!=null && ans.next.next!=null){
            ListNode n1 = ans.next;
            ListNode n2 = n1.next;
            ListNode n3 = n2.next;
            n2.next = n1;
            n1.next = n3;
            ans.next = n2;
            ans = n1;
        }
        return result.next;
    }
}