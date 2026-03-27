public class FriendsPairing {
    public static int pairFriends(int n) {
        // Base case: 1 friend has 1 way, 2 friends have 2 ways (both single, or 1 pair)
        if(n == 1 || n == 2) {
            return n; 
        }
        
        // Choice 1: Current friend remains single
        int singleWays = pairFriends(n - 1); 
        
        // Choice 2: Current friend pairs up with any of the remaining (n-1) friends
        int pairWays = (n - 1) * pairFriends(n - 2); 
        
        // Total ways
        return singleWays + pairWays; 
    }

    public static void main(String[] args) {
        int friendsCount1 = 3;
        System.out.println("Total friends: " + friendsCount1);
        System.out.println("Ways to pair or remain single: " + pairFriends(friendsCount1)); 
        
        int friendsCount2 = 4;
        System.out.println("\nTotal friends: " + friendsCount2);
        System.out.println("Ways to pair or remain single: " + pairFriends(friendsCount2)); 
    }
} 
