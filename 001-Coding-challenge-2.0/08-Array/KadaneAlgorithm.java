public class KadaneAlgorithm {
    public static void subarraySum(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currsum += numbers[i];

            // Print the current sum at each step
            System.out.println("Current Sum after adding " + numbers[i] + " : " + currsum);

            // Update maxsum
            maxsum = Math.max(currsum, maxsum);

            // Reset currsum if it's negative
            if (currsum < 0) {
                System.out.println("Current Sum reset to 0");
                currsum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        subarraySum(numbers);
    }
}
