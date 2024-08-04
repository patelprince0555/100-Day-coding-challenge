// Insertion sort
// pick an element from sorted part and place in the right pos in sorted part

public class insertion_sort {
    public static void insertionSort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int unsorted=i;
            while (unsorted>0&&nums[unsorted]<nums[unsorted-1]) {
                int temp=nums[unsorted-1];
                nums[unsorted-1]=nums[unsorted];
                nums[unsorted]=temp;
                unsorted--;
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
        int nums[]={5,4,1,3,2};
        insertionSort(nums);
        printArray(nums);
        
    }
}
