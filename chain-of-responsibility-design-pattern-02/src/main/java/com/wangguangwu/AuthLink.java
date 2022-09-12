package com.wangguangwu;

/**
 * @author wangguangwu
 */
public abstract class AuthLink {

    /**
     * 审核级别
     */
    protected int level;

    /**
     * 链路下一个需要处理的节点
     */
    private AuthLink next;

    protected AuthLink(Integer level) {
        this.level = level;
    }

    public AuthLink next() {
        return this.next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    /**
     * 审批流程
     *
     * @param orderId 订单编号
     * @param money   报销金额 分为单位
     * @return 审核结果
     */
    public abstract String doAuth(Long orderId, Long money);

}
