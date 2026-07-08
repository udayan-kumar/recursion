import java.util.ArrayList;

public class subset_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
      System.out.println(sub(arr, "", 0));
    }

    public static ArrayList<String> sub(int[] arr,String ans, int index){
        if(index == arr.length) {
            ArrayList <String> list = new ArrayList<>();
           list.add(ans);
            return list;
        }  
        int n = arr[index];
        ArrayList<String> left = sub(arr, ans+n, index+1);
         ArrayList<String> right = sub(arr, ans, index+1);
         left.addAll(right);
         return left;
    }
}
