/**
 * This class provides a recursive solution to find and print all nodes 
 * at the K-th level of a Binary Tree.
 */
public class KthLevelOfBinaryTree {

    // TreeNode class representing a single element in the binary tree
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Prints all nodes at a specified level k.
     * * @param root  The current node in the traversal.
     * @param level The current level of the tree (1-indexed starting from root).
     * @param k     The target level to print.
     */
    public static void printKthLevel(TreeNode root, int level, int k) {
        // Base case: If tree is empty or we reach past a leaf node
        if (root == null) {
            return;
        }
        
        // If the current level matches the target level, print the node's data
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        
        // Recursively traverse left and right subtrees, incrementing the level
        printKthLevel(root.left, level + 1, k);
        printKthLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        /* Constructing the following binary tree:
                 1 
               /   \ 
              2     3 
             / \   / \
            4   5 6   7 
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int k = 2; // Target level
        
        System.out.print("Nodes at level " + k + ": ");
        printKthLevel(root, 1, k);
        System.out.println(); // For a clean console output format
    }
}
