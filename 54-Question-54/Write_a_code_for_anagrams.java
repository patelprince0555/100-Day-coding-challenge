import java.util.Arrays;

public class Write_a_code_for_anagrams {
    public static boolean anagrams(String str , String str1){
        str= str.toLowerCase();
        str1=str1.toLowerCase();
        if(str.length()!=str1.length()){
            return false;
        }
        char newstr[]=str.toCharArray();
        char newstr1[]=str1.toCharArray();

        Arrays.sort(newstr);
        Arrays.sort(newstr1);

        return Arrays.equals(newstr, newstr1);

    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        if (anagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
