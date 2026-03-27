public class TreeUtilities {
    
    // Node Class
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 1. Calculate Height of the Tree - O(N)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // 2. Count Total Nodes in the Tree - O(N)
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // 3. Calculate Sum of all Nodes - O(N)
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    // Utility to print tree (Preorder style)
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        /*
                  1
                 / \
                2   3
               / \ / \
              4  5 6  7
        */
        
        // Manual Tree Creation
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Binary Tree Utilities:");
        System.out.print("Tree Elements (Preorder): ");
        printTree(root);
        System.out.println("\n");
        
        System.out.println("Height of Tree: " + height(root));
        System.out.println("Total Nodes:    " + count(root));
        System.out.println("Sum of Nodes:   " + sum(root));
    }
}
