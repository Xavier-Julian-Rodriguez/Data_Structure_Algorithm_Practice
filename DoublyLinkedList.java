
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node prev;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Node Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Node Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Node Length: " + length);
    }

    public void printList() {
        Node temp = head;
        while(temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}
