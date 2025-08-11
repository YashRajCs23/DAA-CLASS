public class linearSearch{
    //TIME COMPLEXITY: O(n)
    //SPACE COMPLEXITY: O(1)
    public static int ls(int arr[],int target){
        if(arr==null||arr.length==0)return -1; //base cases
        else{
            for(int i=0;i<arr.length;i++){ // iterate through the array
                if(arr[i]==target){
                    return i; // return the index if target is found
                }
            }
        }
        return -1; // target not found
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 3;
        int result = ls(arr, target);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}