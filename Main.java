class Main {
    public static void main (String[] args) {
        // ----------> LinkedList practice <-------------------
        // LinkedList myLinkedList = new LinkedList(1);
        // myLinkedList.appendNode(2);
        // System.out.println(myLinkedList.removeLastNode().value);
        // System.out.println(myLinkedList.removeLastNode().value);
        // System.out.println(myLinkedList.removeLastNode());
        // myLinkedList.removeFirstNode();
        // myLinkedList.prependNode(3);
        // myLinkedList.printAll();
        // System.out.println("getNode method:");
        // myLinkedList.getNode(1);
        // myLinkedList.setNode(0, 1);
        // myLinkedList.setNode(1, 2);
        // myLinkedList.setNode(2, 3);
        // myLinkedList.insertNode(3, 4);
        //myLinkedList.printAll();
        //System.out.println(myLinkedList.removeNode(1).value);
        // myLinkedList.reverseList();
        // myLinkedList.printAll();


        // ----------> DoublyLinkedList practice <-------------------
        // DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(2);
        // myDoublyLinkedList.appendNode(3);
        // myDoublyLinkedList.prependNode(1);
        // myDoublyLinkedList.getHead();
        // myDoublyLinkedList.getTail();
        // myDoublyLinkedList.getLength();
        // myDoublyLinkedList.insertNode(99, 2);
        // myDoublyLinkedList.printList();
        
        // myDoublyLinkedList.removeNode(2);
        // myDoublyLinkedList.printList();

        // ----------> Stacks practice <-------------------
        // Stack myStack = new Stack(1);
        // myStack.pushNode(2);
        // myStack.pushNode(3);
        // myStack.getTop();
        // myStack.getHeight();
        // myStack.printStack();

        // ----------> Queues practice <-------------------
        Queues myQueue = new Queues(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.printList();
    }
}
