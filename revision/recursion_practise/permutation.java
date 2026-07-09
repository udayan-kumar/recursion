public class permutation {
    public static void main(String[] args) {
        per("abc", "");
    }

    public static void per(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        for(int i = 0; i<=ans.length(); i++){
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            per(str.substring(1), first+ch+second);
        }
    }
}
