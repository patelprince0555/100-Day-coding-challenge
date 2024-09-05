import java.util.Scanner;

public class Missing_number_in_an_array {
    public static int missingNumber(int nums[]){
        int n= nums.length;
        int sum=0;
        int totalsum=(n*(n+1))/2;
        for(int i=0 ;i<n; i++){
            sum=sum+nums[i];
        }
        return totalsum-sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of a array");
        int n = sc.nextInt();
        int array[]= new int[n];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(missingNumber(array));
        
    }
}
