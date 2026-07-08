public class find_sorting_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // sort(arr, 0);
        System.out.println(sort(arr, 0));
    }

    // public static void sort(int[] arr, int index){
    //     if(index == (arr.length-1)) return;
        
    //     if(arr[index]<arr[index+1] ) {
    //         System.out.println("true");
    //     }
    //     else System.out.println("false");
    //      sort(arr, index+1);
         
         
    // }

    public static boolean sort(int[] arr, int index){
        if(index == (arr.length-1)) return true;
        return arr[index] < arr[index+1] && sort(arr, index+1);
       

    }
}
