public class step_become_zero {
    public static void main(String[] args) {
        System.out.println(zero(41, 0));
    }

    public static int zero(int n, int step){
        if(n==0) return step;
        if(n%2 == 0){
            return zero(n/2, step+1); 
        }
        else {
          return zero(n-1, step+1);
        }
    }
}
