public class bubbleSort {
	public static void BS(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BS(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// Passes: always n-1
// Comparisons (Worst case): n(n-1)/2 swaps : n(n-1 )/2 
// Comparisons (Best case): n-1 swaps : 0
// Comparisons (Average case): ~n(n-1)/4 swaps : ~n(n-1)/4
// Time Complexity: O(n^2) in worst and average case, O(n) in best case
// Space Complexity: O(1) as it uses only a constant amount of space
