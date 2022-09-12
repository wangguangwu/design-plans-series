package com.wangguangwu;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * <p>
 * 1. auth 审核流程
 * 2. queryAuthInfo 查询审核信息（时间）
 *
 * @author wangguangwu
 */
public final class AuthService {

    /**
     * processId -> money
     */
    private static final Map<Long, Long> AUTH_MONEY = new ConcurrentHashMap<>();

    /**
     * processId_level -> result
     * 默认审核结果都是通过
     */
    private static final Map<String, Boolean> AUTH_RESULT = new ConcurrentHashMap<>();

    public static Boolean queryAuthInfo(Long processId, int level) {
        Long money = AUTH_MONEY.get(processId);
        if (money == null) {
            return false;
        }
        String key = processId + "_" + level;
        return AUTH_RESULT.containsKey(key);
    }

    public static void auth(Long processId, Long money) {
        AUTH_MONEY.put(processId, money);
    }

    public static void auth(Long processId, Long money, int level) {
        if (!AUTH_MONEY.containsKey(processId)) {
            auth(processId, money);
        }
        AUTH_RESULT.put(processId + "_" + level, true);
    }

    private AuthService() {
    }
}
