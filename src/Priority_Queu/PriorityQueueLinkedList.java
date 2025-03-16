package Priority_Queu;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public  class PriorityQueueLinkedList {
    private Node head; // Head always holds the highest priority element

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null || value > head.data) { // Insert at head if priority is highest
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.data > value) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int deleteMax() {
        if (head == null) return -1;
        int maxValue = head.data;
        head = head.next; // Remove the highest priority element
        return maxValue;
    }

    public void printQueue() {
        Node temp = head;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();
        pq.insert(3);
        pq.insert(5);
        pq.insert(1);
        pq.insert(4);

        pq.printQueue();
        System.out.println("Deleted max: " + pq.deleteMax());
        pq.printQueue();
    }
}
