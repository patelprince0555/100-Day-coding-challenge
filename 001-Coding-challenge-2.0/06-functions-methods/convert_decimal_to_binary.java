public class convert_decimal_to_binary {
    public static void decimaltobinary(int n){
        int pow=0;
        int binonum=0;
        while(n>0){
            int rem=n%2;
            binonum=binonum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println(binonum);
    }
    public static void main(String[] args) {
        decimaltobinary(5);
    }
}
