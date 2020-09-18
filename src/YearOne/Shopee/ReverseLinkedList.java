package YearOne.Shopee;

public class ReverseLinkedList {
    /**
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode reverseList(ListNode head) {
        // dummy为返回的哑元节点，cur为当前遍历的节点
        ListNode dummy, cur;
        dummy = null;
        cur = head;
        ListNode tmp = null;
        while (cur != null) {
            // 把当前节点分离出来
            tmp = cur.next;
            // 头插法到dummy
            cur.next = dummy;
            // 转换新链表的头，cur成为dummy
            dummy = cur;
            // 原链表指向下一个节点
            cur = tmp;
        }

        return dummy;
    }
}