public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if(length == 0) {
            System.out.println("Head is null.");
            System.out.println("Tail is null.");
        } else {
            System.out.println("Head is: " + head.value);
            System.out.println("Tail is: " + tail.value);
        }
        System.out.println("Linked List Length: " + length);
        System.out.println("Linked List: ");
        if(length == 0) {
            System.out.println("is empty.");
        } else {
            printList();
        }
    }

    
}
