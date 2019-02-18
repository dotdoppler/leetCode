/**
 * @author zxy
 * @date 2019/2/18
 */
public class DeleteNodeInLinkedList {
    public static void deleteNode(ListNode node) {
        int temp = node.next.val;
        node.val = temp;
        node.next = node.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}