public class counting_zero {
    public static void main(String[] args) {
       System.out.println( zero(1020304005,0));
    }

    public static int zero(int n , int count){
        if(n == 0) return count;
       
        if(n%10 == 0){
            return zero(n/10, count+1);
        }
        return zero(n/10, count);
    }
}
