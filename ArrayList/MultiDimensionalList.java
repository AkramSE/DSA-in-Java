import java.util.ArrayList;

public class MultiDimensionalList {
    public static void main(String[] args) {
        // Main list containing other lists (2D ArrayList)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        //  Populating lists with multiples of 1, 2, and 3
        for(int i = 1; i <= 5; i++) {
            list1.add(i * 1); // 1 2 3 4 5
            list2.add(i * 2); // 2 4 6 8 10
            list3.add(i * 3); // 3 6 9 12 15
        }
        
        // Adding 1D lists into the 2D main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        
        System.out.println("Printing 2D ArrayList:");
        
        // Nested loops to traverse and print the 2D ArrayList
        for(int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            
            System.out.print("List " + (i + 1) + ": ");
            for(int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
