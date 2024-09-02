// counting sort

public class counting_sort {
    public static void countingSort(int number[]){
        int n = number.length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest, number[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[number[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                number[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[]={2,1,4,3,5};
        countingSort(num);
        printArray(num);
    }
}
 