// print subarrays

public class print_subArrays {
    public static void printSubarray(int numbers[]){
        int tr=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                tr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tr);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarray(numbers);
    }
}
