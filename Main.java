class Main {
    public static void main (String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        
        myLinkedList.appendNode(2);
        
        // System.out.println(myLinkedList.removeLastNode().value);
        // System.out.println(myLinkedList.removeLastNode().value);
        // System.out.println(myLinkedList.removeLastNode());
        
        // myLinkedList.removeFirstNode();
        myLinkedList.prependNode(3);
        myLinkedList.printAll();
        System.out.println("getNode method:");
        myLinkedList.getNode(1);
        myLinkedList.setNode(0, 1);
        myLinkedList.setNode(1, 2);
        myLinkedList.setNode(2, 3);

        myLinkedList.insertNode(3, 4);
        
        //myLinkedList.printAll();
        //System.out.println(myLinkedList.removeNode(1).value);

        myLinkedList.reverseList();
        myLinkedList.printAll();


    }
}
