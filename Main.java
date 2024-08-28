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
        System.out.println(myLinkedList.getNode(1));
        System.out.println(myLinkedList.setNode(0, 1));
        System.out.println(myLinkedList.setNode(1, 2));
        System.out.println(myLinkedList.setNode(2, 3));

        myLinkedList.printAll();


    }
}
