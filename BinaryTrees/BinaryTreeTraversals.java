import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversals {
    
    // Node Class
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

    // Binary Tree Class
    static class BinaryTree {
        static int indx = -1;

        // Method to Build Tree from an array (Preorder logic)
        public Node buildTree(int[] nodes) {
            indx++;
            if (indx >= nodes.length || nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // 1. Preorder Traversal (Root, Left, Right)
        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // 2. Inorder Traversal (Left, Root, Right)
        public void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // 3. Postorder Traversal (Left, Right, Root)
        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // 4. Level Order Traversal (Breadth-First Search)
        public void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
        
        // Helper method to visualize the tree structure
        public void printShape() {
            System.out.println("          1 "); 
            System.out.println("         / \\ "); 
            System.out.println("        2   3 "); 
            System.out.println("       / \\ / \\ "); 
            System.out.println("      4  5 6  7 "); 
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};

        System.out.println("Binary Tree Building & Traversals:");
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("Preorder Traversal:  ");
        tree.preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal:   ");
        tree.inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(root);
        System.out.println();

        System.out.println("Levelorder Traversal:");
        tree.levelorder(root);
        
        System.out.println("Tree Visual Shape:");
        tree.printShape();
    }
}
