package com.wangguangwu;

import com.wangguangwu.cook.impl.GuangDongCook;
import com.wangguangwu.cook.impl.JiangSuCook;
import com.wangguangwu.cook.impl.ShanDongCook;
import com.wangguangwu.cook.impl.SiChuanCook;
import com.wangguangwu.cuisine.ICuisine;
import com.wangguangwu.cuisine.impl.GuangDoneCuisine;
import com.wangguangwu.cuisine.impl.JiangSuCuisine;
import com.wangguangwu.cuisine.impl.ShanDongCuisine;
import com.wangguangwu.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

/**
 * @author wangguangwu
 */
public class WaiterTest {

    @Test
    public void test(){

        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        ICuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ICuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        ICuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        Waiter waiter = new Waiter();
        waiter.order(guangDoneCuisine);
        waiter.order(jiangSuCuisine);
        waiter.order(shanDongCuisine);
        waiter.order(siChuanCuisine);

        // 下单
        waiter.placeOrder();
    }

}
