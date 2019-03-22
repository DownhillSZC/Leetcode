
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t = new ListNode(0);
        ListNode ans = t;
        while(true){
            int temp = l1.val + l2.val + ans.val;
            if(temp >= 10){
                ans.val = temp - 10;
                ListNode tempNode = new ListNode(1);
                ans.next = tempNode;
            }
            else{
                ans.val = temp;
            }
       
            if(l1.next == null && l2.next==null){
                break;
            }
            else if(l1.next == null && l2.next != null){
                l1.val = 0;
                l2 = l2.next;
            }
            else if(l1.next != null && l2.next == null){
                l2.val = 0;
                l1 = l1.next;
            }
            else{
                l1 = l1.next;
                l2 = l2.next;
            }
        
            if(ans.next == null){
                ans.next = new ListNode(0);
            }        
            ans = ans.next;
        }    
        return t;            
    }
	
	//简洁写法
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans = new ListNode(0);
//        ListNode p = l1, q = l2, curr = ans;
//        int carry = 0;
//        
//        while(p != null || q != null){
//            int x = (p!=null) ? p.val : 0;
//            int y = (q!=null) ? q.val : 0;
//            int sum = x + y + carry;
//            carry = sum/10;
//            curr.next = new ListNode(sum % 10);
//            curr = curr.next;
//            if(p != null) p = p.next;
//            if(q != null) q = q.next;
//        }
//        
//        if (carry > 0) {
//            curr.next = new ListNode(carry);
//        }
//        return ans.next;
//        
//    }
}
