public class BinaryTreeDiameter { 
     static class Node {
          int data; 
          Node left, right; 
          
          public Node(int data){
               this.data = data; 
               this.left = null; 
               this.right = null; 
          }
     } 
     
     // Calculate height of the tree 
     public static int height(Node root){
          if(root == null){
             return 0; 
          } 
          int lh = height(root.left); 
          int rh = height(root.right); 
          return Math.max(lh, rh) + 1; 
     } 
     
     // Approach 1: Diameter of tree - Time Complexity O(N^2)
     public static int diameterApproach1(Node root) {  
           if(root == null) {
              return 0; 
           } 
           int ld = diameterApproach1(root.left); 
           int lh = height(root.left); 
           int rd = diameterApproach1(root.right); 
           int rh = height(root.right); 
           
           int self = lh + rh + 1; 
           return Math.max(self, Math.max(ld, rd)); 
     } 
     
     // Info class for optimized approach
     static class Info {
          int diam; 
          int ht; 
          
          public Info(int diam, int ht){
               this.diam = diam; 
               this.ht = ht; 
          }
     } 
     
     // Approach 2: Diameter of tree - Time Complexity O(N) (Optimized)
     public static Info diameterOptimized(Node root){
          if(root == null){
             return new Info(0, 0); 
          } 
          
          Info leftInfo = diameterOptimized(root.left); 
          Info rightInfo = diameterOptimized(root.right); 
          
          int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1); 
          int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1; 
          
          return new Info(diam, ht); 
     }
     
     public static void main(String arg[]){ 
          /* 1 
                   / \ 
                  2   3 
                 / \ / \
                4  5 6  7 
          */ 
          Node root = new Node(1); 
          root.left = new Node(2); 
          root.right = new Node(3); 
          root.left.left = new Node(4); 
          root.left.right = new Node(5); 
          root.right.left = new Node(6); 
          root.right.right = new Node(7); 
          
          System.out.println("Diameter using Approach 1 O(N^2): " + diameterApproach1(root)); 
          
          Info optimizedResult = diameterOptimized(root);
          System.out.println("Diameter using Optimized Approach O(N): " + optimizedResult.diam); 
          System.out.println("Height of Tree: " + optimizedResult.ht); 
     }
} 
                             
