
public class Palindromic_pattern {
    public static void printpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print("");
                }
               else{
                System.out.print(j);
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpattern(5);
        
    }
}
