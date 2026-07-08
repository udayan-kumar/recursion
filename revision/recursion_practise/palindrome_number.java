public class palindrome_number {
    public static void main(String[] args) {
       pali(121, 121);
    }

    public static void pali(int n, int original){
        int ans = 0;
       
        ans = ans*10 +(n/10);
         pali(n/10, original);
          if(n == 0){
            if(ans == original){ 
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            return ;
        }

    }

    
}
58