public class StockBuySell2 {




    public static void main(String[] args) {

        long[] arr = {5,2,6,1,4,7,3,6};

        // Calculate and print the maximum profit
        System.out.println("The maximum profit that can be generated is " + getMaximumProfit(arr));
    }

    private static int getMaximumProfit(long[] arr) {
        int profit =0;
        for(int i=1;i<arr.length;i++ ){
            if(arr[i] > arr[i-1] ){
                profit +=  (arr[i]- arr[i-1]);
            }
        }
        return  profit;
    }
}

