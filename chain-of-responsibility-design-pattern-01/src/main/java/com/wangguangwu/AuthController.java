package com.wangguangwu;

/**
 * 假定一个报销审批链路，定义逻辑
 * <p>
 * 1. 100 元以下部门普通财务签字就可以；
 * 2. 100 元以上，1000 元以下，在以上流程完成后需要再找财务总监签字；
 * 3. 1000 元以上，10000 元以下，在以上流程完成后需要总经理签字。
 *
 * @author wangguangwu
 */
public class AuthController {

    /**
     * 审批流程
     *
     * @param orderId 订单编号
     * @param money   报销金额 分为单位
     * @return 审核结果
     */
    public String doAuth(Long orderId, Long money) {
        // 审批金额
        long level1Cover = 10000;
        long level2Cover = 100000;
        long level3Cover = 1000000;

        if (money <= 0) {
            return "你逗我玩呢";
        }

        if (money > level3Cover) {
            return "超预算了";
        }

        // 一级审批
        Boolean level1Success = AuthService.queryAuthInfo(orderId, 1);
        if (Boolean.FALSE.equals(level1Success)) {
            return "待审核一级";
        }

        // 二级审批
        if (money > level1Cover) {
            Boolean level2Success = AuthService.queryAuthInfo(orderId, 2);
            if (Boolean.FALSE.equals(level2Success)) {
                return "待审核二级";
            }
        }

        // 三级审批
        if (money > level2Cover) {
            Boolean level3Success = AuthService.queryAuthInfo(orderId, 3);
            if (Boolean.FALSE.equals(level3Success)) {
                return "待审核三级";
            }
        }
        return "审批完成";
    }

}
