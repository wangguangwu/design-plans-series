package com.wangguangwu;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wangguangwu
 */
public class AuthControllerTest {

    private final Logger logger = LoggerFactory.getLogger(AuthControllerTest.class);

    @Test
    public void test() {
        AuthController authController = new AuthController();

        // 模拟一级负责人审批
        logger.info("测试结果：{}", authController.doAuth(11111L, 10000000L));
        logger.info("测试结果：{}", "模拟一级负责人审批");
        AuthService.auth(11111L, 10000000L, 1);

        // 模拟二级负责人审批
        logger.info("测试结果：{}", authController.doAuth(11111L, 10000000L));
        logger.info("测试结果：{}", "模拟二级负责人审批");
        AuthService.auth(11111L, 10000000L, 2);

        // 模拟三级负责人审批
        logger.info("测试结果：{}", authController.doAuth(11111L, 10000000L));
        logger.info("测试结果：{}", "模拟三级负责人审批");
        AuthService.auth(11111L, 10000000L, 3);

        Assert.assertEquals("审批完成", authController.doAuth(11111L, 10000000L));
        logger.info("测试结果：{}", "审批完成");
    }

}
