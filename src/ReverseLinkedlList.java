/**
 * @author zxy
 * @date 2019/2/20
 */
public class ReverseLinkedlList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode current = head.next;
            head.next = pre;
            pre = head;
            head = current;
        }
        return pre;
    }
}

