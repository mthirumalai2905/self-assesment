package Test7;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printMiddle() {
        Node slow = head;
        Node fast = head;

        if (head != null) {
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("Middle Element(s): " + slow.data);
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class middle {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // Add elements to the linked list
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        System.out.println("Linked List:");
        ll.printList(ll.head);

        System.out.println("Middle Element(s):");
        ll.printMiddle();
    }
}
