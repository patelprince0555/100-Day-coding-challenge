public class Type_promotion{
    public static void main(String[] args) {
        // byte a=10;
        // short b=5;
        // char c='a';
        // char d=(char)(a+b+c);
        // System.out.println(a+b+c);
        // System.out.println(d);
        // int d=30;



        long a=30;
        float b=20.25f;
        double c=10;
        float d=(float)(a+b+c);
        System.out.println(d);
        System.out.println(a+b+c);
    }
}