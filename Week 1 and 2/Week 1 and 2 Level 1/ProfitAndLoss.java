class ProfitAndLoss {
    public static void main(String[] args) {
        // Define cost price and selling price
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        
        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        
        // Output the results using a single print statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}