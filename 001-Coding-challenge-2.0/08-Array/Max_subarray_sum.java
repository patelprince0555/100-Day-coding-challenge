public class Max_subarray_sum { 
    public static void subarraySum(int numbers[]){
       
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+numbers[k];
                    System.out.println("currsum is "+currsum);
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maxsum is "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        subarraySum(numbers);
    }
}
