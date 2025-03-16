package skiplist;

public class SplayTree {
    class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    private Node root;

    // Right Rotation
    private Node rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        return y;
    }

    // Left Rotation
    private Node leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        return y;
    }

    // Splaying operation: Moves a given key to the root
    private Node splay(Node root, int key) {
        if (root == null || root.key == key) return root;

        // Left subtree case
        if (key < root.key) {
            if (root.left == null) return root;

            if (key < root.left.key) { // Zig-Zig (Left Left)
                root.left.left = splay(root.left.left, key);
                root = rightRotate(root);
            } else if (key > root.left.key) { // Zig-Zag (Left Right)
                root.left.right = splay(root.left.right, key);
                if (root.left.right != null)
                    root.left = leftRotate(root.left);
            }
            return (root.left == null) ? root : rightRotate(root);
        }
        // Right subtree case
        else {
            if (root.right == null) return root;

            if (key > root.right.key) { // Zag-Zag (Right Right)
                root.right.right = splay(root.right.right, key);
                root = leftRotate(root);
            } else if (key < root.right.key) { // Zag-Zig (Right Left)
                root.right.left = splay(root.right.left, key);
                if (root.right.left != null)
                    root.right = rightRotate(root.right);
            }
            return (root.right == null) ? root : leftRotate(root);
        }
    }

    // Insert operation
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        root = splay(root, key);
        if (root.key == key) return;

        Node newNode = new Node(key);
        if (key < root.key) {
            newNode.right = root;
            newNode.left = root.left;
            root.left = null;
        } else {
            newNode.left = root;
            newNode.right = root.right;
            root.right = null;
        }
        root = newNode;
    }

    // Search operation
    public boolean search(int key) {
        root = splay(root, key);
        return root != null && root.key == key;
    }

    // Delete operation
    public void delete(int key) {
        if (root == null) return;
        root = splay(root, key);
        if (root.key != key) return;

        if (root.left == null) {
            root = root.right;
        } else {
            Node temp = root.right;
            root = splay(root.left, key);
            root.right = temp;
        }
    }

    // Preorder traversal
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void printTree() {
        preOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        SplayTree tree = new SplayTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Splay Tree after insertions:");
        tree.printTree();

        System.out.println("Search for 30: " + tree.search(30));
        tree.printTree();

        System.out.println("Deleting 20...");
        tree.delete(20);
        tree.printTree();
    }
}

