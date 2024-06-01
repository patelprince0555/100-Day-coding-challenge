// Write a Java program to check if a number is a palindrome in Java

import java.util.Scanner;

public class palindrome{
    public static int ispalindrome(int n){
        int reverse=0;
       while(n!=0){
        int lastdigit = n%10;
        reverse=reverse*10+lastdigit;
        n=n/10;
       }
       return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        if(ispalindrome(number1)==number1){
            System.out.println("number: "+number1+" is a palindrome");
        }else{
            System.out.println("number: "+number1+" is not a palindrome");
        }
        
    }
}