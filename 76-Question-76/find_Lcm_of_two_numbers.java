// Find LCM of two numbers
// Problem Statement: Find lcm of two numbers.

// Examples:

// Example 1:
// Input: num1 = 4,num2 = 8
// Output: 8


// Example 2:
// Input: num1 = 3,num2 = 6
// Output: 6
public class find_Lcm_of_two_numbers {
    public static int Greatestcommondivisior(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=Math.min(n1, n2);i++){
            if(n1%i==0&&n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void printLcm(int n1 ,int n2){
        int Lcm=(n1*n2)/Greatestcommondivisior(n1,n2);// used this formula
        System.out.println(Lcm);
    }
    public static void main(String[] args) {
        printLcm(4, 8);
        
    }
}
