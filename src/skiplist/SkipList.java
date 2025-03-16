package skiplist;

import java.util.Random;

class SkipListNode {
    int key;
    SkipListNode[] forward;

    public SkipListNode(int key, int level) {
        this.key = key;
        this.forward = new SkipListNode[level + 1]; // Array of forward pointers
    }
}

public class SkipList {
    private static final int MAX_LEVEL = 16;
    private final double P = 0.5; // Probability factor
    private final Random random;
    private SkipListNode head;
    private int level;

    public SkipList() {
        this.head = new SkipListNode(-1, MAX_LEVEL);
        this.level = 0;
        this.random = new Random();
    }

    // Generate random level for a new node
    private int randomLevel() {
        int lvl = 0;
        while (random.nextDouble() < P && lvl < MAX_LEVEL) {
            lvl++;
        }
        return lvl;
    }

    // Insert a key into the Skip List
    public void insert(int key) {
        SkipListNode[] update = new SkipListNode[MAX_LEVEL + 1];
        SkipListNode curr = head;

        for (int i = level; i >= 0; i--) {
            while (curr.forward[i] != null && curr.forward[i].key < key) {
                curr = curr.forward[i];
            }
            update[i] = curr;
        }

        int newLevel = randomLevel();
        if (newLevel > level) {
            for (int i = level + 1; i <= newLevel; i++) {
                update[i] = head;
            }
            level = newLevel;
        }

        SkipListNode newNode = new SkipListNode(key, newLevel);
        for (int i = 0; i <= newLevel; i++) {
            newNode.forward[i] = update[i].forward[i];
            update[i].forward[i] = newNode;
        }
    }

    // Search for a key in the Skip List
    public boolean search(int key) {
        SkipListNode curr = head;
        for (int i = level; i >= 0; i--) {
            while (curr.forward[i] != null && curr.forward[i].key < key) {
                curr = curr.forward[i];
            }
        }
        curr = curr.forward[0];
        return curr != null && curr.key == key;
    }

    // Delete a key from the Skip List
    public void delete(int key) {
        SkipListNode[] update = new SkipListNode[MAX_LEVEL + 1];
        SkipListNode curr = head;

        for (int i = level; i >= 0; i--) {
            while (curr.forward[i] != null && curr.forward[i].key < key) {
                curr = curr.forward[i];
            }
            update[i] = curr;
        }

        curr = curr.forward[0];
        if (curr != null && curr.key == key) {
            for (int i = 0; i <= level; i++) {
                if (update[i].forward[i] != curr) break;
                update[i].forward[i] = curr.forward[i];
            }

            while (level > 0 && head.forward[level] == null) {
                level--;
            }
        }
    }

    // Print the Skip List
    public void printList() {
        for (int i = level; i >= 0; i--) {
            SkipListNode node = head.forward[i];
            System.out.print("Level " + i + ": ");
            while (node != null) {
                System.out.print(node.key + " ");
                node = node.forward[i];
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SkipList skipList = new SkipList();
        skipList.insert(3);
        skipList.insert(6);
        skipList.insert(7);
        skipList.insert(9);
        skipList.insert(12);
        skipList.insert(19);

        skipList.printList();

        System.out.println("Search 7: " + skipList.search(7));
        System.out.println("Search 15: " + skipList.search(15));

        skipList.delete(6);
        System.out.println("After deletion of 6:");
        skipList.printList();
    }
}

