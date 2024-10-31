public class Type_promotion{
    public static void main(String[] args) {
        byte a=10;
        short b=5;
        char c='a';
        char d=(char)(a+b+c);
        System.out.println(a+b+c);
        System.out.println(d);
    }
}