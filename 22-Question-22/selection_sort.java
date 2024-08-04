// selection-sort
// pick the smallest from unsorted put it at the beginning
public class selection_sort {
    public static void selectionSort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    public static  void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5,4,3,1,2};
        selectionSort(nums);
        printArray(nums);
    }
}
