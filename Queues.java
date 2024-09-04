

public class Queues {
    Node first;
    Node last;
    int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queues(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst() {
        System.out.println("First in Queue: " + first.value);
    }

    public void getLast() {
        System.out.println("Last in Queue: " + last.value);
    }

    public void getLength() {
        System.out.println("Queue Length: " + length);
    }

    public void printList() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}
