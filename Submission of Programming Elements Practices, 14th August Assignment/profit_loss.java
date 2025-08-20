public class profit_loss {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit*100.0)/costPrice;
        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d" +
                          "\nThe Profit is INR %d and the Profit Percentage is %.2f%%\n",
                          costPrice, sellingPrice, profit, profitPercent);
    }
}