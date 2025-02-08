public class Max_subarray_sum { 
    public static void subarraySum(int numbers[]){
    //     int maxsum=Integer.MIN_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             int currsum=0;
    //             for(int k=i;k<=j;k++){
    //                 currsum=currsum+numbers[k];
    //                 System.out.println("currsum is "+currsum);
    //             }
    //             if(maxsum<currsum){
    //                 maxsum=currsum;
    //             }
    //         }
    //     }
    //     System.out.println("maxsum is "+maxsum);
    // }

// max subarray sum by using prefix array
    int maxsum=Integer.MIN_VALUE;
    int currsum;
    int prefix[]=new int[numbers.length];
    prefix[0]=numbers[0];
    for(int i=1;i<prefix.length;i++){
        prefix[i]=numbers[i]+prefix[i-1];
    }
    for(int i=0;i<numbers.length;i++){
        for(int j=i;j<numbers.length;j++){
            if(i==0){
                currsum=prefix[j];
            }else{
                currsum=prefix[j]-prefix[i-1];
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
