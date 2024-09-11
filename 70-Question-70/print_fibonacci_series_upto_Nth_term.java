// Print Fibonacci Series up to Nth term
// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

// Examples:

// Example 1:
// Input: N = 5
// Output: 0 1 1 2 3 5
// Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

// Example 2:
// Input: 6

// Output: 0 1 1 2 3 5 8
// Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

public class print_fibonacci_series_upto_Nth_term {
    public static int[] printFibonacci(int n){
        int fib[]=new int[n+1];
        if(n==0){
            return fib;
        }else{
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<=n;i++){
                fib[i]=fib[i-2]+fib[i-1];
            }
        }
        return fib;
    }

    public static void printArray(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n[]=printFibonacci(5);
        printArray(n);
    }
}
