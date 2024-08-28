
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

        if (length == 0) {
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

    public Node prependNode(int value) {
        Node temp = head;
        Node newNode = new Node(value);
        if (length == 0 ) {
            head = newNode;
            tail = newNode;
        } else {
            head = newNode;
            head.next = temp;
        }
        length++;
        return newNode;
    }

    public Node removeFirstNode() {
        if(length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length ==0) {
            tail = null;
        }
        return temp;
    }

    public Node getNode(int index) {
        if(index < 0 || index > length) {
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean setNode(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }
        Node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }

    public boolean insertNode(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }
        if(index == 0) {
            prependNode(value);
            return true;
        }
        if(index == length) {
            appendNode(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getNode(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node removeNode(int index) {
        if(index < 0 || index > length) {
            return null;
        }
        
        if(index == 0) {
            return removeFirstNode();
        }

        if(index == length) {
            return removeLastNode();
        }


        Node prev = getNode(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
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
