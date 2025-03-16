package LISTOPERATION_CHATGPT;

class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node last;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    public void delete(int key) {
        if (last == null) return;
        if (last == last.next && last.data == key) {
            last = null;
            return;
        }
        Node temp = last;
        do {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                if (last.data == key) last = temp;
                return;
            }
            temp = temp.next;
        } while (temp != last);
    }

    public void traverse() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(back to head)");
    }
}
