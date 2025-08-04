public class firstAndLastOccurence {
    public static int first(int arr[],int x){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                ans=mid; 
                high=mid-1; 
            } else if(arr[mid]<x) {
                low=mid+1;  
            } else {
                high=mid-1; 
            }
        }
        return ans;
    }
    public static int last(int arr[],int x){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            } else if(arr[mid]<x) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,4,5};
        int target = 2;
        int f=first(arr, target);
        int l=last(arr, target);
        System.out.println("First Occurrence index: " + f+" "+ "Last Occurrence index: " + l);
    }
}
