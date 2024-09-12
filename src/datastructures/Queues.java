package src.datastructures;


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

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) {
            return null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        if(length == 0) {
            first = null;
            last = null;
        }
        return temp;
    }
    
}
