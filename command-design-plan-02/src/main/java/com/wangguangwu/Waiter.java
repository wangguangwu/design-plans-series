package com.wangguangwu;

import com.wangguangwu.cuisine.ICuisine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class Waiter {

    private final List<ICuisine> cuisineList = new ArrayList<>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }
}
