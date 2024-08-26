
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

    public void appendNode(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length = 1;
        } else {
            // create new node
            // point last node to new node;
            // move tail to new node
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLastNode() {
        //for a multi list remove last node and return it
        //for a null list add print statement
        //for a one node list remove it and return it

        Node removed_node = null;
        if (length == 0) {
            System.out.println("Node list is empty. Nothing to remove.");
            return null;
        }
        Node temp = head;
        Node previous = head;
        while(temp.next != null) {
            previous = temp;
            temp = temp.next;
        }

        tail = previous;
        tail.next = null;
        length--; 
        if(length == 0) {
            head = null;
            tail = null;
        };
        return temp;
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
