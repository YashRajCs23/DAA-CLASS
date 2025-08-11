public class binarySearch {
    public static int bs(int[] arr, int target) {
        int i=0,j=arr.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target)i=mid+1;
            else j=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = bs(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}