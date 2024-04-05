package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }
    public void addItem(Product Item){items.add(Item);}

    public List<Product> getItems(){
        return items;
    }
}
