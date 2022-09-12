package com.wangguangwu;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangguangwu
 */
public class Waiter {

    private final Logger logger = LoggerFactory.getLogger(Waiter.class);

    private final Map<Integer, String> cuisineMap = new ConcurrentHashMap<>();

    /**
     * 点餐服务
     *
     * @param cuisine 点餐
     */
    public void order(int cuisine) {
        // 广东（粤菜）
        if (CuisineEnum.GUANG_DONG.getNumber() == cuisine) {
            cuisineMap.put(1, "广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
        }

        // 江苏（苏菜）
        if (CuisineEnum.JIANG_SU.getNumber() == cuisine) {
            cuisineMap.put(2, "江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
        }

        // 山东（鲁菜）
        if (CuisineEnum.SHAN_DONG.getNumber() == cuisine) {
            cuisineMap.put(3, "山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头.");
        }

        // 四川（川菜）
        if (CuisineEnum.SI_CHUAN.getNumber() == cuisine) {
            cuisineMap.put(4, "四川厨师，烹饪川菜，中国最有特色的菜系，也是民间最大菜系。");
        }
    }

    /**
     * 展示订单
     */
    public void placeOrder() {
        String json = JSON.toJSONString(cuisineMap);
        logger.info("订单：{}", json);
    }
}
