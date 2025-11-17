public class fibonacci {
    // Recursion | TC: O(2^n), SC: O(n)
    public static int fibonacciRecursion(int n) {
        if (n <= 1) return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
    // DP Memoization | TC: O(n), SC: O(n)
    public static int fibonacciMemoization(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = fibonacciMemoization(n - 1, dp) + fibonacciMemoization(n - 2, dp);
        return dp[n];
    }
    // DP Tabulation | TC: O(n), SC: O(n)
    public static int fibonacciTabulation(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
    // Space Optimized DP OR Iterative | TC: O(n), SC: O(1)
    public static int fibonacciSpaceOptimized(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 10;
        // Recursion
        System.out.println("Fibonacci (Recursion) of " + n + ": " + fibonacciRecursion(n));
        // DP Memoization
        int[] dpMemo = new int[n + 1];
        for (int i = 0; i <= n; i++) dpMemo[i] = -1;
        System.out.println("Fibonacci (Memoization) of " + n + ": " + fibonacciMemoization(n, dpMemo));
        // DP Tabulation
        System.out.println("Fibonacci (Tabulation) of " + n + ": " + fibonacciTabulation(n));
        // Space Optimized DP
        System.out.println("Fibonacci (Space Optimized) of " + n + ": " + fibonacciSpaceOptimized(n));
    }
}