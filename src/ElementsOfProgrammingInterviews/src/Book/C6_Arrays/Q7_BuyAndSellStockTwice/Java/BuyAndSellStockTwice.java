package ElementsOfProgrammingInterviews.src.Book.C6_Arrays.Q7_BuyAndSellStockTwice.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuyAndSellStockTwice {
    public static double buyAndSellStockTwice(List<Double> prices){
        double maxTotalProfit = 0.0;
        List<Double> firstBuySellProfits = new ArrayList<>();
        double minPriceSoFar = Double.MAX_VALUE;

        // Forward phase. For each day, we record maximum profit if we sell on that day
        for (int i=0; i<prices.size(); ++i){
            minPriceSoFar = Math.min(minPriceSoFar, prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, prices.get(i)-minPriceSoFar);
            firstBuySellProfits.add(maxTotalProfit);
        }

        // Backward phase. For each day, find the maximum profit if we make the second buy on that day.
        double maxPriceSoFar = Double.MIN_VALUE;
        for (int i=prices.size()-1; i>0; --i){
            maxPriceSoFar = Math.max(maxPriceSoFar, prices.get(i));
            maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar-prices.get(i)+firstBuySellProfits.get(i-1));
        }
        return maxTotalProfit;
    }

    private static double buyAndSellStockTwiceConstantSpace(List<Double> prices) {
        List<Double> minPrices = Arrays.asList(Double.MAX_VALUE, Double.MAX_VALUE),
                maxProfits = Arrays.asList(0.0, 0.0);
        for (Double price : prices) {
            for (int i = 1; i >= 0; --i) {
                maxProfits.set(i,
                        Math.max(maxProfits.get(i), price - minPrices.get(i)));
                minPrices.set(
                        i,
                        Math.min(minPrices.get(i),
                                price - (i - 1 >= 0 ? maxProfits.get(i - 1) : 0.0)));
            }
        }
        return maxProfits.get(1);
    }

    public static void main(String[] args){
        List<Double> a = new ArrayList<>();
        a.add(12.0);
        a.add(11.0);
        a.add(13.0);
        a.add(9.0);
        a.add(12.0);
        a.add(8.0);
        a.add(14.0);
        a.add(13.0);
        a.add(15.0);
        System.out.println(buyAndSellStockTwice(a));
        assert(Double.compare(buyAndSellStockTwiceConstantSpace(a), buyAndSellStockTwice(a)) == 0);
    }
}
