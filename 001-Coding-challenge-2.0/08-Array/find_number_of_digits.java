public class find_number_of_digits {
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int findFirstDigit(int n) {
        while (n >= 10) {
            n = n / 10; // Keep dividing by 10 until we get the first digit
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 66318;
        System.out.println("Number of digits: " + countDigits(n));
        System.out.println("First digit: " + findFirstDigit(n));
    }
}
