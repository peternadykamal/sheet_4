package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> items = new ArrayList<GroceryItemOrder>();
    private int numberOfItems;

    public GroceryList(){}

    public int getNumberOfItems() {
        numberOfItems = items.size();
        return numberOfItems;
    }

    public void add(GroceryItemOrder item){
        if (numberOfItems<10){
            items.add(item);
        }
    }
    public double getTotalCost(){
        double sum = 0;
        for (GroceryItemOrder item :
                items) {
            sum+=item.getCost();
        }
        return sum;
    }
}
