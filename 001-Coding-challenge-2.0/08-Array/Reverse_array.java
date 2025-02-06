public class Reverse_array{
    public static void reverseArray(int numbers[]){
        int start=0;
        int end = numbers.length-1;
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int numbers[]){
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args){
        int numbers[]={5,7,6,3,2,1};
        reverseArray(numbers);
        printArray(numbers);

    }
}