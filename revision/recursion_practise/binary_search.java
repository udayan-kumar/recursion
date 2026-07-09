public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binary(arr, 6, 0, arr.length-1));
    } 
    public static int binary(int[] arr, int target, int low , int high){
        int mid = (low + high)/2;
        if(low > high) return -1;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target) return binary(arr, target, low, mid-1);
        // if(arr[mid] < target) return binary(arr, target, mid+1, high);
        return binary(arr, target, mid + 1, high);
    }
}