// write a java method to compute the sum of the digits in an integer
public class sum_of_the_digits{
    public static int sumofdigits(int n){
        int sum=0;
       while(n>0){
        int lastdigit=n%10;
        sum=sum+lastdigit;
       }
       return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(121));
        
    }
}