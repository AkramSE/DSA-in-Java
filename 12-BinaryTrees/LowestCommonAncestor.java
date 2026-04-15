/**
 * A class to find the Lowest Common Ancestor (LCA) of two nodes in a Binary Tree.
 */
public class LowestCommonAncestor {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Finds the lowest common ancestor of two target nodes in a binary tree.
     *
     * @param root The root node of the binary tree.
     * @param n1   The integer data of the first node.
     * @param n2   The integer data of the second node.
     * @return The LCA Node if both nodes exist, or null if the tree is empty.
     */
    public static Node lca(Node root, int n1, int n2) {
        // Base case: If root is null or we find either of the nodes
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        // Search recursively in left and right subtrees
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        // If one node is found in the left subtree and the other in the right, root is the LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return whichever node is not null
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        /*
               Tree Structure:
                    1 
                  /   \ 
                 2     3 
                / \   / \
               4   5 6   7 
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Test Case 1: Nodes on opposite sides of the tree
        int n1 = 4, n2 = 7;
        Node lcaNode1 = lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + (lcaNode1 != null ? lcaNode1.data : "null"));

        // Test Case 2: One node is the ancestor of the other
        int n3 = 2, n4 = 4;
        Node lcaNode2 = lca(root, n3, n4);
        System.out.println("LCA of " + n3 + " and " + n4 + " is: " + (lcaNode2 != null ? lcaNode2.data : "null"));
    }
          }
