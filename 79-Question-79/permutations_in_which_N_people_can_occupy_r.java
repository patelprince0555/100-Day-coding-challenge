// Permutations in which N people can occupy R seats
// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

// Examples:

// Example 1:
// Input: N = 5, r = 3
// Output: 60
// Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

// Example 2:
// Input: N=6,r = 4.
// Output: 360

public class permutations_in_which_N_people_can_occupy_r {
    public static int printfactorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void printPermutations(int n,int r){
        int fact_n=printfactorial(n);
        int fact_nmr=printfactorial(n-r);
        int permutations=fact_n/fact_nmr;
        System.out.println(permutations);
    }
    public static void main(String[] args) {
        printPermutations(5, 3);
        
    }
}
