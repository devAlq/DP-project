import java.util.HashMap;
import java.util.Map;

public class Main {

    // * Create a HashMap called `memo` of type `Map<Integer, Integer>` to store the base case and the result of the recursive function.
    // Your code here 

    public static void main(String[] args) {
        int initialTrees = 10; // Assuming the farmer starts with 1 tree
        int days = 2; // Number of iterations
        int result = doubleTrees(initialTrees, days);
        System.out.println("Number of trees after " + days + " iterations: " + result);
    }

    public static int doubleTrees(int initialTrees, int n) {
        if (n == 0) {
            return initialTrees;
        }
        // Check if the result is already in the memo
        // Your code here 
        
        int result = 2 * doubleTrees(initialTrees, n - 1);

        // Store the result of the recursive function in the `memo` HashMap.
        // Your code here
        
        
        return result;
    }
}