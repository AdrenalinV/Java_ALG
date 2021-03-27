package Lesson_5;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<Item> bestItems = null;
    private final int maxWeight;
    private int bestPrice;

    public ArrayList<Item> getBestItems() {
        return bestItems;
    }

    public int getBestPrice() {
        return bestPrice;
    }

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int sumWeight(ArrayList<Item> items) {
        int result = 0;
        for (Item item : items) {
            result += item.getWeight();
        }
        return result;
    }

    private int sumPrice(ArrayList<Item> items) {
        int result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    private void checkItemsBest(ArrayList<Item> items) {
        if (bestItems == null) {
            if (sumWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = sumPrice(items);
            }
        } else {
            if (sumWeight(items) <= maxWeight && sumPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = sumPrice(items);
            }
        }
    }

    public void bruteForceList(ArrayList<Item> items) {
        if (items.size() == 0) {
            return;
        }
        checkItemsBest(items);
        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newItems = new ArrayList<>(items);
            newItems.remove(i);
            bruteForceList(newItems);
        }
    }
}
