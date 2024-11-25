public class inverted_rotated {
    public static void printPattern(int n){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(4);
        //   *
        //  **
        // ***
        //****
        
    }
}
