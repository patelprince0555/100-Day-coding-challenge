// Reverse an array
public class reverse_an_array {
    public static void reversearray(int numbers[]){
        int start =0;
        int end = numbers.length-1;
         while (start<=end) {
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
         }
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,3,8,4};
         reversearray(numbers);
         for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
         }
    }
}
