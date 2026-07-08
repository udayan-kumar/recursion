public class remove_string_letter {
    public static void main(String[] args) {
        String str = "baccade";
        sub(" ", str, 0);
    }

    public static void sub(String ans, String str, int index){
        if(index == str.length()) return;
        char ch = str.charAt(index);
        if(ch != 'a'){
            sub(ans+ch, str, index+1);
            System.out.println(ans);
        }
        else
            sub(ans, str, index+1);
    }
}
