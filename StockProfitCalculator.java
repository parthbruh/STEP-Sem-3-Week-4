import java.util.Scanner;

public class StockProfitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the stock prices separated by spaces: ");
        String inputLine = scanner.nextLine();
        
        // Split the input string by spaces and convert it to an integer array
        String[] stringPrices = inputLine.trim().split("\\s+");
        int[] prices = new int[stringPrices.length];
        
        if (!inputLine.trim().isEmpty()) {
            for (int i = 0; i < stringPrices.length; i++) {
                prices[i] = Integer.parseInt(stringPrices[i]);
            }
        } else {
            prices = new int[0];
        }
        
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
        
        scanner.close();
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}