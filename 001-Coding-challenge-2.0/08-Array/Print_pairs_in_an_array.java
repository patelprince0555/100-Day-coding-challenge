 public class Print_pairs_in_an_array{
    public static void pairsArray(int numbers[]){
        int totalpairs =0;
        for(int i=0;i<numbers.length;i++){
            int primarynum=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                int secnum=numbers[j];
                System.out.println("("+ primarynum +","+ secnum +")");
                totalpairs++;
            }
        }
        System.out.println(totalpairs);
    }
    public static void main(String[]args){
        int array[]={2,4,6,8,10};
        pairsArray(array);
    }
}