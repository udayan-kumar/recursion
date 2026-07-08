
public class subset_string {
    public static void main(String[] args) {
        String str = "abc";
        sub("", str, 0);
    }

    public static void sub(String ans,String str, int index){
        if(index == str.length()){
            System.out.print(ans + " ");
             return;
        }
         char ch = str.charAt(index);
       sub(ans+ch, str, index+1);  // pick
       sub(ans, str, index+1);  // skip
    }
}
