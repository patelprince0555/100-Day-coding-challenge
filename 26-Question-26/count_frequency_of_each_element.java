// count frequency of each element in an array

public class count_frequency_of_each_element {
    public static void countFrequency(int nums[]){
        int freq[]=new int[nums.length];
        int visited=-1;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    freq[j]=visited;
                }if(freq[i]!=visited){
                    freq[i]=count;
                }
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=visited){
                System.out.println("element    ||   frequency");
                System.out.println(nums[i]+"     ||         "+freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={10,5,10,15,10,5};
        countFrequency(nums);
    }
}
