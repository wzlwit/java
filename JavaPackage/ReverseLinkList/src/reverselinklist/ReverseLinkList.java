package reverselinklist;

public class ReverseLinkList {

    public static void main(String[] args) {

        Node head = new Node(11, new Node(3, new Node(52, new Node(10, null))));
        System.out.println("original:");
        printLinkList(head);
        Node headReversed = reverse(head);
        System.out.println("reversed: ");
        printLinkList(headReversed);
    }

    public static void printLinkList(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.value + ", ");
            p = p.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node markNextNode = head.next;
        Node headReverseOfRest = reverse(head.next);
        markNextNode.next = head;
        head.next = null;
        return headReverseOfRest;
    }
}
