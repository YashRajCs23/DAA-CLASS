package greedy.fractionalKnapsack;
import java.util.*;
class Item {
    int index, profit, weight;
    Item(int index, int profit, int weight) {
        this.index = index;
        this.profit = profit;
        this.weight = weight;
    }
}
public class MinWeight {
    public static void main(String[] args) {
        int[] profits = {10, 5, 15, 7, 6, 10, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int capacity = 15;
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) items.add(new Item(i + 1, profits[i], weights[i]));
        items.sort((a, b) -> a.weight - b.weight);
        double totalProfit = 0;
        int currentWeight = 0;
        System.out.println("Item\tWeight Taken\tProfit Added");
        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                totalProfit += item.profit;
                System.out.println(item.index + "\t" + item.weight + "\t\t" + item.profit);
            } else {
                int remaining = capacity - currentWeight;
                double profitFraction = item.profit * (remaining / (double) item.weight);
                totalProfit += profitFraction;
                System.out.println(item.index + "\t" + remaining + " (fraction)\t" + profitFraction);
                break;
            }
        }
        System.out.println("\nTotal Profit = " + totalProfit);
    }
}