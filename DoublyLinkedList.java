
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
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void appendNode(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = tail;

        if(length == 0) {
            return null;
        }
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prependNode(int value) {
        Node temp = head;
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) {
            return null;
        }
        Node temp = head.next;
        temp.prev = null;
        head.next = null;
        head = temp;
        length--;
        
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node getIndex(int index) {
        Node temp = head;

        if(length == 0) {
            return null;
        } else {
            if(index < length / 2) {
                for(int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            } else {
                temp = tail;
                for(int i = length - 1; i > index; i--) {
                    temp = temp.prev;
                }
            }
            return temp;
        }
    }

    public boolean setNode(int value, int index) {
        Node temp = getIndex(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insertNode(int value, int index) {
        Node temp = getIndex(index);
        Node newNode = new Node(value);
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
        Node prev = temp.prev;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = temp;
        temp.prev = newNode;
        length++;

        return true;
    }

    public Node removeNode(int index) {

        if(length == 0) {
            return null;
        }
        if(index == 0) {
            return removeFirst();
        }
        if(index == length - 1) {
            return removeLast();
        }
        Node temp = getIndex(index);
        Node before = temp.prev;
        Node after = temp.next;
        before.next = after;
        after.prev = before;
        temp.prev = null;
        temp.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    
}
