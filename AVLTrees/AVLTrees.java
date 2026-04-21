public class AVLTrees {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    public static Node root;

    // Helper function to get height of the tree
    public static int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Helper function to get balance factor of a node
    public static int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a node and balance the tree
    public static Node insert(Node node, int key) {
        // Standard BST insertion
        if (node == null) return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node; // Duplicate keys not allowed

        // Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get the balance factor to check whether this node became unbalanced
        int bf = getBalance(node);

        // Balancing the tree
        // Left Left Case
        if (bf > 1 && key < node.left.data) return rightRotate(node);
        
        // Right Right Case
        if (bf < -1 && key > node.right.data) return leftRotate(node);
        
        // Left Right Case
        if (bf > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        // Right Left Case
        if (bf < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Helper to find the node with minimum value
    public static Node getMinNode(Node node) {
        Node current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    // Delete a node and balance the tree
    public static Node deleteNode(Node root, int key) {
        // Standard BST Delete
        if (root == null) return root;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found
            if ((root.left == null) || (root.right == null)) {
                Node temp = (root.left != null) ? root.left : root.right;
                // No child or one child case
                root = temp;
            } else {
                // Node with two children
                Node temp = getMinNode(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right, temp.data);
            }
        }

        // If the tree had only one node then return
        if (root == null) return root;

        // Update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // Rebalance the tree
        int bf = getBalance(root);

        // Left Left Case
        if (bf > 1 && getBalance(root.left) >= 0) return rightRotate(root);
        
        // Left Right Case
        if (bf > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        
        // Right Right Case
        if (bf < -1 && getBalance(root.right) <= 0) return leftRotate(root);
        
        // Right Left Case
        if (bf < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.println("Preorder traversal of constructed AVL tree:");
        preorder(root);
        
        System.out.println("\n\nDeleting 30...");
        root = deleteNode(root, 30);
        
        System.out.println("Preorder traversal after deletion:");
        preorder(root);
        System.out.println();
    }
  }
