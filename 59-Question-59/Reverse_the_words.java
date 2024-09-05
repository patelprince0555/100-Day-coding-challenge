import java.util.Scanner;

public class Reverse_the_words {
    public static void reverseWords(String str){
        String words[]=str.split("");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+"");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str= sc.nextLine();
        reverseWords(str);
    }
}
