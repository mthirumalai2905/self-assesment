package Test7;

public class common {
    class LinkedList {
        Node head;
    
        // Define Node class and other methods (e.g., push) here
    
        Node findCommonNode(LinkedList list1, LinkedList list2) {
            int len1 = getLength(list1);
            int len2 = getLength(list2);
    
            int diff = Math.abs(len1 - len2);
    
            Node current1 = list1.head;
            Node current2 = list2.head;
    
            // Move the pointer of the longer list forward by the difference in lengths
            if (len1 > len2) {
                for (int i = 0; i < diff; i++) {
                    current1 = current1.next;
                }
            } else {
                for (int i = 0; i < diff; i++) {
                    current2 = current2.next;
                }
            }
    
            // Iterate through both lists until a common node is found
            while (current1 != null && current2 != null) {
                if (current1 == current2) {
                    return current1; // Found common node
                }
                current1 = current1.next;
                current2 = current2.next;
            }
    
            return null; // No common node found
        }
    
        int getLength(LinkedList list) {
            int length = 0;
            Node current = list.head;
            while (current != null) {
                length++;
                current = current.next;
            }
            return length;
        }
    }
    
}
