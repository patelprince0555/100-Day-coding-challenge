// Program to Find Roots of a quadratic equation
// Problem Statement: The standard form of a quadratic equation is:

// ax2 + bx + c = 0, where a, b and c are real numbers and a != 0

// You have given a, b, c of the equation, you have found the roots of the equation.

// Examples:

// Example 1:
// Input: a = 1, b = -3, c = -10
// Output: Roots are real and different, i.e(5 , -2).

// Example2:

// Input: a = 1, b = 1, c = 1
// Output: Roots are complex, i.e-(-0.5+i1.732 , -0.5-i1.732).

public class find_roots_of_Quadratic_equation {
    public static void Roots(int a, int b, int c)
    {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
 
        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));
 
        if (d > 0) {
            System.out.println("Roots are real and different ");
           
            double root1 = (double)(-b + sqrt_val) / (2 * a);
            double root2 = (double)(-b - sqrt_val) / (2 * a);
            System.out.println(root1 + " "+root2);
            }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            double root1 = -(double)b / (2 * a);
            double root2 = -(double)b / (2 * a);
            System.out.println(root1 + " "+root2);
        }
        else // d < 0
        {
            System.out.println("Roots are complex ");
 
            System.out.println(-(double)b / (2 * a) + " + i"+ sqrt_val + " "+
                               -(double)b / (2 * a) + " - i" + sqrt_val);
        }
    }
    public static void main(String[] args) {
        int a = 1, b = -3, c = -10;
             
        Roots(a, b, c);
        
    }
}
