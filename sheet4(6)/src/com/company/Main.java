package com.company;

public class Main {

    public static void main(String[] args) {
        GroceryList itemList = new GroceryList();

        GroceryItemOrder apples = new GroceryItemOrder("apple", 3,7);
        itemList.add(apples);

        GroceryItemOrder milk = new GroceryItemOrder("milk",2,12);
        itemList.add(milk);

        GroceryItemOrder cookies = new GroceryItemOrder("cookies", 4,2.30);
        itemList.add(cookies);

        GroceryItemOrder rice = new GroceryItemOrder("rice", 2,4.40);
        itemList.add(rice);

        System.out.println("number of items = "+itemList.getNumberOfItems());
        System.out.println("Total cost = "+itemList.getTotalCost());
    }
}
