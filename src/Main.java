import java.util.HashMap;
import java.util.Map;

public class Main {

    static HashMap<Integer, Integer> memo = new HashMap<>();
    

    public static void main(String[] args) {
        int initialTrees = 10; 
        int days =2; 
        int result = doubleTrees(initialTrees, days , 1);
        System.out.println(memo);

        System.out.println("Number of trees after " + days + " iterations: " + result);
    }

    public static int doubleTrees(int initialTrees, int n,int curentDay) {
      
        if (memo.get(curentDay) != null) {
            return memo.get(curentDay);
        }
                
        memo.put(curentDay, initialTrees );
        
        if (n == 1) {
            return initialTrees;
        }
        return doubleTrees(initialTrees * 2, n - 1, curentDay + 1);
    }
}
