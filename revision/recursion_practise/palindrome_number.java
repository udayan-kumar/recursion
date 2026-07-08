public class palindrome_number {
    public static void main(String[] args) {
       pali(121, 121);
    }

    public static void pali(int n, int original){
        if(n == 0) return;
        int ans = n%10;
       ans+= ans*10;
        pali(n/10, original);
        if(ans == original){
            System.out.println("true");
        }
        else System.out.println("false");
       

    }

    
}
