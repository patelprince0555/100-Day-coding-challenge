import java.util.Scanner;

public class input_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is "+sum);
    }
}
