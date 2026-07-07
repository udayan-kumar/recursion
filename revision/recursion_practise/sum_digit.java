public class sum_digit {
    public static void main(String[] args) {
        System.out.println(sum(6234));
        System.out.println(product(62034));
    }

    public static int sum(int n){
        if(n==0) return n;
        return n%10 + sum(n/10);
    }

    public static int product(int n){
        if(n == 0) return 1;
        return n%10 * product(n/10);
    }
}
