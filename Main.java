class Main {
    public static void main (String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        
        myLinkedList.appendNode(2);
        myLinkedList.printAll();

        System.out.println(myLinkedList.removeLastNode().value);
        System.out.println(myLinkedList.removeLastNode().value);
        System.out.println(myLinkedList.removeLastNode());
    }
}
