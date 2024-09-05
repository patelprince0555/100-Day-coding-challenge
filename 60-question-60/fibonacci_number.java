// fibonacci_number

public class fibonacci_number {
    public static int fibonacciNumber(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=fibonacciNumber(n-1);
        int fnm2=fibonacciNumber(n-2);
        return fnm1+fnm2;
    }
   
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(6));
        
    }
}
