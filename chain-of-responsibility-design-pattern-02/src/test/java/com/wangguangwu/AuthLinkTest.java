package com.wangguangwu;

import com.alibaba.fastjson.JSON;
import com.wangguangwu.impl.Level1AuthLink;
import com.wangguangwu.impl.Level2AuthLink;
import com.wangguangwu.impl.Level3AuthLink;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wangguangwu
 */
public class AuthLinkTest {

    private final Logger logger = LoggerFactory.getLogger(AuthLinkTest.class);

    @Test
    public void testAuthLink() {
        AuthLink authLink = new Level1AuthLink(1)
                .appendNext(new Level2AuthLink(2).appendNext(new Level3AuthLink(3)));

        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth(11111L, 10000000L)));

        // 模拟一级负责人审批
        AuthService.auth(11111L, 10000000L, 1);
        logger.info("测试结果：{}", "模拟一级负责人审批");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth(11111L, 10000000L)));

        // 模拟二级负责人审批
        AuthService.auth(11111L, 10000000L, 2);
        logger.info("测试结果：{}", "模拟二级负责人审批");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth(11111L, 10000000L)));

        // 模拟三级负责人审批
        AuthService.auth(11111L, 10000000L, 3);
        logger.info("测试结果：{}", "模拟三级负责人审批");
        Assert.assertEquals("三级审核完成", authLink.doAuth(11111L, 10000000L));
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth(11111L, 10000000L)));
    }

}
