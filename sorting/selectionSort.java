public class selectionSort {
    public static void SS(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        SS(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
// Passes: always n-1
// Comparisons (Worst case): n(n-1)/2
// Comparisons (Best case): n(n-1)/2
// Comparisons (Average case): n(n-1)/2
// Swaps (Worst, Best, Average case): n-1
// Time Complexity: O(n^2) for all cases
// Space Complexity: O(1) as it uses only a constant amount of space