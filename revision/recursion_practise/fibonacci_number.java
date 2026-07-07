public class fibonacci_number {
    public static void main(String[] args) {
        System.out.println(febc(23));
    }

    public static int febc(int n){
        if(n == 1 || n ==0) return n;
        return febc(n-1) + febc(n-2);
    }
}
