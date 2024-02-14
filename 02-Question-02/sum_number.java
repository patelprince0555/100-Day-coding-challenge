public class sum_number {

    // write a java method to compute the sum of the digits in an integer
    public static int sumofdigit(int n){
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum= sum+lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(sumofdigit(121));
    }
}
