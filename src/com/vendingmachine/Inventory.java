package com.vendingmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Inventory {

    private Inventory() {

    }



    private static HashMap<Product, Integer> inventory = new HashMap<>();
    static { //Product is the Key, Quantity is Value
        inventory.put(new Product(1, "Coca-Cola", 2.50), 10);
        inventory.put(new Product(2, "Water", 1.00), 10);
        inventory.put(new Product(3, "Orange Juice", 2.00), 10);
        inventory.put(new Product(4,"Red Bull", 4.00), 10);
        inventory.put(new Product(5, "Snickers", 1.50), 15);
        inventory.put(new Product(6, "Reeses's Peanut Butter Cup", 1.75), 15);
    }

    public HashMap<Product, Integer>  getInventory() {
        for (Map.Entry entry: inventory.entrySet()) {
            System.out.println(entry.getKey() + " Quantity: " + entry.getValue());
        }
        return inventory;
    }
//    public static <K, V> String getCurrentInventory(Map<K, V> products) {
//        return products.entrySet()
//                .stream()
//                .map(e -> e.getKey() + " Quantity: " + e.getValue())
//                .collect(Collectors.joining(", ", "{,", "}"));
//    }


    public static void main(String[] args) {
        Inventory inventory1 = new Inventory();
        inventory1.getInventory();
    }


}