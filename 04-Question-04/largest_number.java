// find the largest number in a given array
public class largest_number {
    public static int largestnumber(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,10,5,6};
        System.out.println(largestnumber(numbers));
    }
}
