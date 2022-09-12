package com.wangguangwu;

import org.junit.Test;

/**
 * @author wangguangwu
 */
public class WaiterTest {

    @Test
    public void order() {
        // 广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        Waiter waiter = new Waiter();
        waiter.order(1);
        waiter.order(2);
        waiter.order(3);
        waiter.order(4);

        // 下单
        waiter.placeOrder();
    }

}
