// max subarray sum (prefix array)

public class max_subarray_sum {
    public static void MaxSubarraySum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i =0;i<numbers.length;i++){
            int start=i;
            for(int j =i;j<numbers.length;j++){
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int num1[]={1,-2,6,-1,3};
        MaxSubarraySum(num1);
    }
}
