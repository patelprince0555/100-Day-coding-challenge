import java.util.Arrays;
import java.util.Collections;

public class decreasing_order {
    public static void printArray(Integer num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer numbers[]={2,1,5,3,4};
        Arrays.sort(numbers,Collections.reverseOrder());
        printArray(numbers);


        // increasing order
        int numbers2[]={2,1,5,3,4};
        Arrays.sort(numbers2,2,4);// ending index are not Exclusive
        printArray(numbers2);


        Arrays.sort(numbers,0,5,Collections.reverseOrder());
        printArray(numbers);
    }
}
