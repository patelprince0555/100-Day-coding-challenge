// Program to Add two fractions
// Problem Statement: Adding two fractional numbers.

// Examples:

// Example 1:
// Input: 3/4 + 1/7 
// Output: 25/28
// Explanation: Since 3/4 + 1/7 = 25/28

// Example 2:
// Input: 5/2 +1/2
// Output: 3/1
// Explanation: Since 5/2 + 1/2 = 3/1

public class program_to_add_two_fraction {
    public static int gcd(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=Math.min(n1, n2);i++){
            if(n1%i==0&&n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void addFraction(int num1, int den1, int num2, int den2) {
        // Calculate LCM of the denominators
        int lcm = (den1 * den2) / gcd(den1, den2);

        // Calculate the numerators for both fractions
        int numerator1 = num1 * (lcm / den1);
        int numerator2 = num2 * (lcm / den2);

        // Sum the numerators
        int numeratorSum = numerator1 + numerator2;

        // Reduce the fraction to its simplest form
        int commonDivisor = gcd(numeratorSum, lcm);
        System.out.println(commonDivisor);

        // Simplified numerator and denominator
        int simplifiedNum = numeratorSum / commonDivisor;
        int simplifiedDen = lcm / commonDivisor;

        // Print the result as a fraction
        System.out.println("Sum of fractions: " + simplifiedNum + "/" + simplifiedDen);
    }
    public static void main(String[] args) {
        addFraction(5, 2, 1, 2);
        
    }
}
