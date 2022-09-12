package com.wangguangwu.cook.impl;

import com.wangguangwu.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wangguangwu
 */
public class ShanDongCook implements ICook {

    private final Logger logger = LoggerFactory.getLogger(ShanDongCook.class);

    @Override
    public void doCooking() {
        logger.info("山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
