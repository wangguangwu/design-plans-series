package com.wangguangwu.impl;

import com.wangguangwu.AuthLink;
import com.wangguangwu.AuthService;

/**
 * @author wangguangwu
 */
public class Level2AuthLink extends AuthLink {

    public Level2AuthLink(Integer level) {
        super(level);
    }

    @Override
    public String doAuth(Long orderId, Long money) {
        Boolean isAuth = AuthService.queryAuthInfo(orderId, 2);
        if (Boolean.FALSE.equals(isAuth)) {
            return "待审核二级";
        }
        // 下一个节点
        AuthLink next = super.next();
        if (next == null) {
            return "二级审核完成";
        }

        long levelCover = 100000L;
        if (money > levelCover) {
            return next.doAuth(orderId, money);
        }
        return "审核完成";
    }
}
