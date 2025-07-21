package RemoveDuplicatesFromSortedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DeleteDuplicates {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-3);
        head.next = new ListNode(-1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(3);
        // printList(head);
        head = deleteDuplicates(head);
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        Set<Integer> seen = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            seen.add(current.val);
            current = current.next;
        }
        Iterator<Integer> iterator = seen.stream().sorted().iterator();
        ListNode dummy = new ListNode();
        current = dummy;
        while (iterator.hasNext()) {
            int valor = iterator.next();
            System.out.println("Valor: " + valor);
            current.next = new ListNode(valor);
            current = current.next;
        }
        return dummy.next;
    }
}
