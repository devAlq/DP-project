# Dynamic Programming Project

## Objective
The purpose of this project is to validate your knowledge of Dynamic Programming algorithms.

## Problem
A farmer has a land. Each day, he plants double the number of trees he planted the day before.

Create a function that takes in the number of days and the number of trees the farmer can plant and returns the total number of trees the farmer can plant in the given number of days. 

If the number of days is 3, and the farmer can start by planting 10 trees on the first day, the farmer will plant 20 trees on the second day. And 40 trees on the third day.


## Implementation

* Create a HashMap called `memo` of type `Map<Integer, Integer>` to store the base case and the result of the recursive function.
* Check if the result of the recursive function is already stored in the `memo` HashMap. If it is, return the value stored in the `memo` HashMap.
* Store the result of the recursive function in the `memo` HashMap.


```java
import java.util.HashMap;
import java.util.Map;

public class Main {

    // * Create a HashMap called `memo` of type `Map<Integer, Integer>` to store the base case and the result of the recursive function.
    // Your code here 

    public static void main(String[] args) {
        int initialTrees = 10;
        int days = 2; // Number of iterations
        int result = doubleTrees(initialTrees, days);
        System.out.println("Number of trees after " + days + " iterations: " + result);
    }

    public static int doubleTrees(int initialTrees, int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
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
```

## Example
```
Number of trees after 2 iterations: 20

```

