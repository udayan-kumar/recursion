import java.util.ArrayList;

public class searching {
    public static void main(String[] args) {
        int[] arr = {1,4,2,76,7,7,7,8};
        System.out.println(find(arr, 76, 0));
         System.out.println(findindx(arr, 76, 0));
       findallindex(arr, 7, 0);
       System.out.println(ans);
    }

    public static boolean find(int[] arr, int target, int index){
        if(index == arr.length-1) return false;
        return arr[index] == target || find(arr, target, index+1);
    }

    public static int findindx(int[] arr, int target , int index){
        if(index == arr.length-1) return -1;
        if(arr[index] == target) return index;
        else return findindx(arr, target, index+1);
    }

    static ArrayList <Integer> ans = new ArrayList<>();
    public static void findallindex(int[] arr, int target , int index){
        if(index == arr.length-1) return ;
        if(arr[index] == target){
            ans.add(index);
        }
          findallindex(arr, target, index+1);
    }
}
29:47