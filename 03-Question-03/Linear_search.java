// linear serch
public class Linear_search {
    public static int linearSearch(int n[],int key){
        for(int i =0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
       int numbers[]={2,4,6,8,10,12,14,16}; 
       System.out.println(linearSearch(numbers, 10));              
    }
}
