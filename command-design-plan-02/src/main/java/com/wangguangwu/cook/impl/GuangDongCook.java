package com.wangguangwu.cook.impl;

import com.wangguangwu.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 实现者具体实现
 *
 * @author wangguangwu
 */
public class GuangDongCook implements ICook {

    private final Logger logger = LoggerFactory.getLogger(GuangDongCook.class);

    @Override
    public void doCooking() {
        logger.info("广东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
