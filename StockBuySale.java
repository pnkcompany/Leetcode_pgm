public class StockBuySale {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};


        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i =0;i< prices.length;i++){
            if(prices[i] < min_value){
                min_value = prices[i];
            } else if (prices[i] -min_value > max_profit) {
                max_profit = prices[i] - min_value;

            }
        }
        System.out.println(max_profit);
    }
}
