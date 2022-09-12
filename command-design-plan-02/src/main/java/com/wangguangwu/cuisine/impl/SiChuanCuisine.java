package com.wangguangwu.cuisine.impl;


import com.wangguangwu.cook.ICook;
import com.wangguangwu.cuisine.ICuisine;


/**
 * @author wangguangwu
 */
public class SiChuanCuisine implements ICuisine {

    private final ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}