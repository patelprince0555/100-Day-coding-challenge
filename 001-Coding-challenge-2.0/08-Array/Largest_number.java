import java.util.Scanner;

public class Largest_number {
    public static int getlargestnumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[]=new int[5];
        System.out.println("Enter an Array");
        for(int i=0; i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
       System.out.println("largest number is "+getlargestnumber(numbers));
    }
}
