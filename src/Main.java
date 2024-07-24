# Dynamic Programming Project

## Objective
The purpose of this project is to validate your knowledge of Dynamic Programming algorithms.

## Problem
A farmer has a land each day he plant double the number of trees he planted the day before. Create a function that takes in the number of days and the number of trees the farmer can plant and returns the total number of trees the farmer can plant in the given number of days. 

Write a function that takes in the number of days and the number of trees the farmer can plant and returns the total number of trees the farmer can plant in the given number of days.

If the number of days is 2 and the number of trees is 10 the result should be 20 trees added to the land.


## Implementation

1. Create an array of size n + 1 called `dp` to store the number of trees planted each day.
2. Initialize the `dp[1]` array with the value of `distance`.
3. Iterate from 2 to n and set the value of `dp[i]` to `dp[i - 1] + distance`.
4. Return the value of `dp[n]`.

```java
public class Main {

    public static int plantTrees(int n, int distance) {
        // Base case: if no trees, distance is 0
        if (n == 0) return 0;
        
        // Your code here

       return 0; // Change this line with your code
    }

    public static void main(String[] args) {
        System.out.println(plantTrees(0, 10)); // 0
        System.out.println(plantTrees(1, 10)); // 10
        System.out.println(plantTrees(2, 10)); // 20
    }
}
```
