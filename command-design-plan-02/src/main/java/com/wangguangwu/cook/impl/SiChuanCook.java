package com.wangguangwu.cook.impl;

import com.wangguangwu.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wangguangwu
 */
public class SiChuanCook implements ICook {

    private final Logger logger = LoggerFactory.getLogger(SiChuanCook.class);

    @Override
    public void doCooking() {
        logger.info("四川厨师，烹饪川菜，中国最有特色的菜系，也是民间最大菜系。");
    }
}
