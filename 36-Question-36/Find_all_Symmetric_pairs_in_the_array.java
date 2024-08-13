//Find all Symmetric Pairs in the array of pairs

// In this article, we will solve the problem: "Find all Symmetric Pairs in the array of pairs"

// Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

// Examples:

// Example 1:
// Input: (1,2),(2,1),(3,4),(4,5),(5,4)
// Output: (2,1) (5,4)
// Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

// Example 2:
// Input: (1,5),(2,3),(4,2),(5,1),(2,4)
// Output: (2,4) (5,1)
// Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.

public class Find_all_Symmetric_pairs_in_the_array {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        System.out.println("The symmetric pairs are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
                    break;
                }
            }
    }
}
}
