// calculate sum of the elements of the array

public class Sum_of_the_elements_of_array {
    public static void sumElements(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum=sum+nums[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int nums[]={15,12,13,10};
        sumElements(nums);
        
    }
}
