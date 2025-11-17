package greedy.fractionalKnapsack;
import java.util.*;
public class DecreasingSort {
    public static void main(String[] args) {
        int[] profits = {10, 5, 15, 7, 6, 10, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int capacity = 15;
        int n = profits.length;
        double[][] items = new double[n][4];
        for (int i = 0; i < n; i++) {
            items[i][0] = i + 1;
            items[i][1] = profits[i];
            items[i][2] = weights[i];
            items[i][3] = (double) profits[i] / weights[i];
        }
        Arrays.sort(items, (a, b) -> Double.compare(b[3], a[3]));
        double totalProfit = 0;
        int currentWeight = 0;
        System.out.println("Item\tWeight Taken\tProfit Added\tPi/Wi");
        for (double[] item : items) {
            int itemNo = (int) item[0];
            double profit = item[1];
            double weight = item[2];
            double ratio = item[3];

            if (currentWeight + weight <= capacity) {
                currentWeight += weight;
                totalProfit += profit;
                System.out.println(itemNo + "\t" + (int)weight + "\t\t" + profit + "\t\t" + ratio);
            } else {
                int remaining = capacity - currentWeight;
                double fractionProfit = profit * (remaining / weight);
                totalProfit += fractionProfit;
                System.out.println(itemNo + "\t" + remaining + " (fraction)\t" + fractionProfit + "\t\t" + ratio);
                break;
            }
        }
        System.out.println("\nTotal Profit (Pi/Wi Approach) = " + totalProfit);
    }
}