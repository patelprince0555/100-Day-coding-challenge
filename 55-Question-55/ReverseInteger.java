public class ReverseInteger {
    public static void main(String[] args) {
        int number = 101001;  // Input number
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to reversedNumber
            number /= 10;  // Remove the last digit
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}