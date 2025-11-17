package greedy.fractionalKnapsack;
import java.util.*;
class Item {
    int index;
    int profit;
    int weight;
    Item(int index, int profit, int weight) {
        this.index = index;
        this.profit = profit;
        this.weight = weight;
    }
}
public class MaxProfit {
    public static void main(String[] args) {
        int[] profits = {10, 5, 15, 7, 6, 10, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int capacity = 15;
        ArrayList<Item> items = new ArrayList<>();
        // Store items
        for (int i = 0; i < profits.length; i++) {
            items.add(new Item(i + 1, profits[i], weights[i]));
        }
        // Sort items by profit in descending order (Max Profit Approach)
        items.sort((a, b) -> b.profit - a.profit);
        double totalProfit = 0;
        int currentWeight = 0;
        System.out.println("Item\tWeight Taken\tProfit Added");
        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // take full item
                currentWeight += item.weight;
                totalProfit += item.profit;
                System.out.println(item.index + "\t" + item.weight + "\t\t" + item.profit);
            } else {
                // take fractional part
                int remaining = capacity - currentWeight;
                double fraction = (double) remaining / item.weight;
                double profitFraction = item.profit * fraction;
                totalProfit += profitFraction;
                System.out.println(item.index + "\t" + remaining + " (fraction)\t" + profitFraction);
                break; // knapsack full
            }
        }
        System.out.println("\nTotal Profit = " + totalProfit);
    }
}