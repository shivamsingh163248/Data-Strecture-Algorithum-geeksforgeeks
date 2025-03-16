package LISTOPERATION_CHATGPT;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("Singly Linked List:");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        sll.traverse();
        sll.delete(20);
        sll.traverse();

        System.out.println("\nDoubly Linked List:");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(40);
        dll.insert(50);
        dll.insert(60);
        dll.traverse();
        dll.delete(50);
        dll.traverse();

        System.out.println("\nCircular Linked List:");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(70);
        cll.insert(80);
        cll.insert(90);
        cll.traverse();
        cll.delete(80);
        cll.traverse();
    }
}

