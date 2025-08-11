public class insertionSort{
    public static void IS(int arr[]){
        int n=arr.length;
        for (int i = 1; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        IS(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
// Passes: always n-1
// Comparisons (Worst case): n(n-1)/2 swaps : n(n-1)/2
// Comparisons (Best case): n-1 swaps : 0
// Comparisons (Average case): ~n(n-1)/4   swaps : ~n(n-1)/4
// Time Complexity: O(n^2) in worst and average case, O(n) in best case
// Space Complexity: O(1) as it uses only a constant amount of space