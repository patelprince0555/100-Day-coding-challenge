//  Max subarray sum (kadane's algorithm)

public class Kadane_Algorithm {
    public static void MaxSubarraysum(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            currsum=currsum+number[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum, maxsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        MaxSubarraysum(numbers);
    }
}
