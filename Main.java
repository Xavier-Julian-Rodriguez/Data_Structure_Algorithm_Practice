class Main {
    public static void main (String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        
        myLinkedList.appendNode(2);
        
        // System.out.println(myLinkedList.removeLastNode().value);
        // System.out.println(myLinkedList.removeLastNode().value);
        // System.out.println(myLinkedList.removeLastNode());
        
        myLinkedList.prependNode(3);
        myLinkedList.printAll();
    }
}
