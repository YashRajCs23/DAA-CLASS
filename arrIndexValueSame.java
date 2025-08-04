public class arrIndexValueSame {
    public static int fixedPoint(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==mid) return mid;
            else if(arr[mid]<mid) i=mid+1;
            else j=mid-1;
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {-10, -5, 0, 3, 4, 7, 9};
        int result = fixedPoint(arr);
        if (result != -1) {
            System.out.println("Fixed point found at index: " + result);
        } else {
            System.out.println("No fixed point found in the array.");
        }
    }
}
