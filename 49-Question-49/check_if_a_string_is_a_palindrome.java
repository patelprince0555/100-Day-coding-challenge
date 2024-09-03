
public class check_if_a_string_is_a_palindrome {
    public static boolean palindrome(String name){
        int n= name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i)!=name.charAt(n-i-1)){
                return false;
            }
            }
            return true;
        }
    
    public static void main(String[] args) {
        String name ="madam";
        boolean isPalindrome = palindrome(name); // Correct variable type

        if (isPalindrome) { // Corrected if statement
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
}
