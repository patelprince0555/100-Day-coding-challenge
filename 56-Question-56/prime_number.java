// prime number

// import java.util.Scanner;
import java.util.*;

public class prime_number {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
           for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
           } 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        if(isPrime(n)==true){
            System.out.println("it is prime number");
        }else{
            System.out.println("it is not prime number");
        }
    }
}
