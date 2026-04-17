public class BinarySearchTree { 
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
     
     // 1. Insert into BST 
     public static Node insert(Node root, int val) {
          if(root == null) {
            root = new Node(val); 
            return root; 
          } 
          
          if(root.data > val) {
             // Go to left Subtree 
             root.left = insert(root.left, val); 
          } else {
              // Go to right Subtree 
              root.right = insert(root.right, val); 
          } 
          return root; 
     } 
     
     // 2. Search in a BST 
     public static boolean search(Node root, int key) {
          if(root == null) {
             return false; 
          } 
          
          if(root.data == key) {
             return true; 
          } 
          
          if(root.data > key) {
            return search(root.left, key); 
          } else {
              return search(root.right, key); 
          } 
     }
     
     // 3. Delete a Node 
     public static Node delete(Node root, int val) {
          if(root.data < val) {
            root.right = delete(root.right, val); 
          } else if(root.data > val) {
              root.left = delete(root.left, val); 
          } else { // Voila! Node found
          
              // Case 1 - Leaf node 
              if(root.left == null && root.right == null) {
                 return null; 
              } 
              
              // Case 2 - Single child 
              if(root.left == null) {
                 return root.right; 
              } else if(root.right == null) { 
                  return root.left; 
              } 
              
              // Case 3 - Both children 
              Node IS = findInorderSuccessor(root.right); 
              root.data = IS.data; 
              root.right = delete(root.right, IS.data); 
          } 
          return root; 
     } 
     
     // Helper for Delete: Find Inorder Successor (Leftmost node in right subtree)
     public static Node findInorderSuccessor(Node root) {
          while(root.left != null) {
               root = root.left; 
          } 
          return root; 
     }
     
     // Print values using Inorder Traversal (Always gives sorted output in BST)
     public static void inorder(Node root) {
          if(root == null) {
            return; 
          } 
          inorder(root.left); 
          System.out.print(root.data + " "); 
          inorder(root.right); 
     } 
     
     public static void main(String args[]) {
          int values[] = {5, 1, 3, 4, 2, 7}; 
          Node root = null; 
          
          // Insert
          for(int i = 0; i < values.length; i++) {
              root = insert(root, values[i]); 
          } 
           
          System.out.print("Inorder Traversal: ");
          inorder(root); 
          System.out.println(); 
          
          // Search 
          int searchKey = 1;
          if(search(root, searchKey)) {
             System.out.println("Key " + searchKey + " is found in the BST."); 
          } else {
              System.out.println("Key " + searchKey + " is not found."); 
          } 
          
          // Delete 
          root = delete(root, 1); 
          System.out.print("Inorder Traversal after deleting 1: "); 
          inorder(root); 
          System.out.println();
     }
} 
