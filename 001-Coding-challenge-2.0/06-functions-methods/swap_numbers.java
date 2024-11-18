public class swap_numbers {
    public static void SwapNumber(int a , int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        SwapNumber(5, 10);
        
    }
}
