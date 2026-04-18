import java.util.ArrayList; 

public class BSTQuestions { 
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
     
     // 1. Insert method to build the tree
     public static Node insert(Node root, int val) {
          if (root == null) {
            root = new Node(val); 
            return root; 
          } 
          
          if (root.data > val) {
             // Left Subtree 
             root.left = insert(root.left, val); 
          } else {
              // Right Subtree 
              root.right = insert(root.right, val); 
          } 
          return root; 
     } 
     
     // Question 1: Print elements in a given Range (k1 to k2)
     public static void printInRange(Node root, int k1, int k2) { 
          if (root == null) { 
             return; 
          } 
          
          if (root.data >= k1 && root.data <= k2) { 
             printInRange(root.left, k1, k2); 
             System.out.print(root.data + " "); 
             printInRange(root.right, k1, k2); 
          } else if (root.data < k1) {
              // Node is smaller than range, go right
              printInRange(root.right, k1, k2); 
          } else {
              // Node is larger than range, go left
              printInRange(root.left, k1, k2); 
          }
     }
     
     // Helper for Question 2: Print Path
     public static void printPath(ArrayList<Integer> path) {
          for(int i = 0; i < path.size(); i++) {
              System.out.print(path.get(i) + "->"); 
          } 
          System.out.println("Null"); 
     }
     
     // Question 2: Print all Root to Leaf paths 
     public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
          if(root == null) {
             return; 
          } 
          
          path.add(root.data); 
          
          // Leaf node condition
          if(root.left == null && root.right == null) {
             printPath(path); 
          } 
          
          printRoot2Leaf(root.left, path); 
          printRoot2Leaf(root.right, path); 
          
          // Backtracking step
          path.remove(path.size() - 1); 
     } 
     
     // Question 3: Validate if a Binary Tree is a valid BST
     public static boolean isValidBST(Node root, Node min, Node max) {
          if(root == null) {
             return true; 
          } 
          
          if(min != null && root.data <= min.data) {
            return false; 
          } else if(max != null && root.data >= max.data) {
              return false; 
          } 
          
          return isValidBST(root.left, min, root) && 
                 isValidBST(root.right, root, max); 
     } 
     
     // Print values method using inorder 
     public static void inorder(Node root) {
          if (root == null) {
            return; 
          } 
          inorder(root.left); 
          System.out.print(root.data + " "); 
          inorder(root.right); 
     } 
     
     public static void main(String args[]) {
          int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14}; 
          Node root = null; 
          
          // Build the BST
          for (int i = 0; i < values.length; i++) {
              root = insert(root, values[i]);
          }
          
          System.out.print("Inorder Traversal: ");
          inorder(root); 
          System.out.println("\n");
          
          // Question 1 Output
          System.out.print("Print in Range (5 to 12): ");
          printInRange(root, 5, 12); 
          System.out.println("\n"); 
          
          // Question 2 Output
          System.out.println("Root to Leaf Paths:");
          printRoot2Leaf(root, new ArrayList<>()); 
          System.out.println();
          
          // Question 3 Output
          if(isValidBST(root, null, null)) {
             System.out.println("BST Validation: It is a Valid BST"); 
          } else {
              System.out.println("BST Validation: It is an Invalid BST"); 
          }
     }
} 
