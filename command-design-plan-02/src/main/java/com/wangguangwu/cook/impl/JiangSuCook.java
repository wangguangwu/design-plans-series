package com.wangguangwu.cook.impl;

import com.wangguangwu.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wangguangwu
 */
public class JiangSuCook implements ICook {

    private final Logger logger = LoggerFactory.getLogger(JiangSuCook.class);

    @Override
    public void doCooking() {
        logger.info("江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
    }
}
