package com.wangguangwu.cuisine.impl;


import com.wangguangwu.cook.ICook;
import com.wangguangwu.cuisine.ICuisine;


/**
 * 具体命令实现类
 *
 * @author wangguangwu
 */
public class GuangDoneCuisine implements ICuisine {

    private final ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
