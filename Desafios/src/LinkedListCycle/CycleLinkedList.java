package LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class CycleLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        // Cria um ciclo: o último nó aponta para o segundo nó
        head.next.next.next.next = head.next;

        boolean result = hasCycle(head);
        System.out.println("Has cycle? " + result);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static boolean hasCycle(ListNode head) {
        ListNode index = head;

        Set<ListNode> dic = new HashSet<>();

        while (index != null) {
            if (dic.contains(index))
                return true;
            else
                dic.add(index);
            System.out.println(index.val);
            index = index.next;
        }

        return false;
    }
}
