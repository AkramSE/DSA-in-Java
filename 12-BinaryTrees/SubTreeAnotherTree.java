public class SubTreeAnotherTree { 
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
     
     // Helper function to check if two trees are exactly the same
     public static boolean isIdentical(Node node, Node subRoot) {
          if(node == null && subRoot == null) {
             return true; 
          } else if(node == null || subRoot == null || node.data != subRoot.data) {
              return false; 
          } 
          
          if(!isIdentical(node.left, subRoot.left)) {
             return false; 
          } 
          if(!isIdentical(node.right, subRoot.right)) {
            return false; 
          } 
          
          return true; 
     } 
     
     // Main function to check if subRoot is a subtree of root
     public static boolean isSubTree(Node root, Node subRoot) {
          if(root == null) {
             return false; 
          }
          
          // If data matches, check if the entire subtree is identical
          if(root.data == subRoot.data) {
             if(isIdentical(root, subRoot)) {
                return true; 
             } 
          } 
          
          // Otherwise, recursively check the left and right subtrees
          return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot); 
     }
     
     public static void main(String args[]) { 
           /* Main Tree:
                 1 
                / \ 
               2   3 
              / \ / \
             4  5 6  7 
          */ 
          Node root = new Node(1); 
          root.left = new Node(2); 
          root.left.left = new Node(4); 
          root.left.right = new Node(5); 
          root.right = new Node(3); 
          root.right.left = new Node(6); 
          root.right.right = new Node(7); 
          
          /* SubTree to find:
               2 
              / \ 
             4   5 
          */ 
          Node subRoot = new Node(2); 
          subRoot.left = new Node(4); 
          subRoot.right = new Node(5); 
          
          System.out.println("Is subRoot a subtree of root? " + isSubTree(root, subRoot)); 
     }
}  
