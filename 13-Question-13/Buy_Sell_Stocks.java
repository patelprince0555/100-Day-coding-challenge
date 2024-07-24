// buy & sell stocks

public class Buy_Sell_Stocks {
    public static int  Buyandsellstocks(int prices[]){
        int Buyprice=Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(Buyprice<prices[i]){
                int profit=prices[i]-Buyprice;
                Maxprofit=Math.max(profit, Maxprofit);
            }
            else{
                Buyprice=prices[i];
            }
        }  
        return Maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(Buyandsellstocks(prices));
    }
}
