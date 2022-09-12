package com.wangguangwu.cuisine.impl;


import com.wangguangwu.cook.ICook;
import com.wangguangwu.cuisine.ICuisine;


/**
 * @author wangguangwu
 */
public class ShanDongCuisine implements ICuisine {

    private final ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}