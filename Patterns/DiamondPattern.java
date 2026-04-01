public class DiamondPattern { 
     public static void diamond_triangle(int n){
          // 1st half (Upper Triangle)
          for(int i=1; i<=n; i++){ 
             // spaces 
             for(int j=1; j<=(n-i); j++){
                System.out.print("  "); 
             } 
             
             // stars (odd numbers: 1, 3, 5...)
             for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* "); 
             } 
             System.out.println(); 
          } 
          
          // 2nd half (Lower Triangle)
          for(int i=n; i>=1; i--){ 
             // spaces 
             for(int j=1; j<=(n-i); j++){
                System.out.print("  "); 
             } 
             
             // stars (odd numbers: ...5, 3, 1)
             for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* "); 
             } 
             System.out.println(); 
          } 
     }
     public static void main(String args[]){
          diamond_triangle(4); 
     }
}
