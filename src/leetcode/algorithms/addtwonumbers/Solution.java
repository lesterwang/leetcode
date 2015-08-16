package leetcode.algorithms.addtwonumbers;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null) {
                return null;
            } else if (l1 == null) {
                return l2;
            } else if (l2 == null) {
                return l1;
            }
            ListNode result = new ListNode(0);
            ListNode last = result;
            int i1, i2, remains = 0, sum;
            while (l1 != null || l2 != null) {
                i1 = l1 == null ? 0 : l1.val;
                i2 = l2 == null ? 0 : l2.val;
                sum = i1 + i2 + remains;
                ListNode current = new ListNode(sum % 10);
                remains = sum / 10;
                last.next = current;
                last = current;
                l1 = l1 == null ? l1 : l1.next;
                l2 = l2 == null ? l2 : l2.next;
            }
            if (remains != 0) {
                last.next = new ListNode(remains);
            }

            return result.next;
        }

        ListNode(int x) {
            val = x;
        }
    }
}
