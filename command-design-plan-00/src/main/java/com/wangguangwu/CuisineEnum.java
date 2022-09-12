package com.wangguangwu;

/**
 * @author wangguangwu
 */
@SuppressWarnings("all")
public enum CuisineEnum {

    GUANG_DONG(1),

    JIANG_SU(2),

    SHAN_DONG(3),

    SI_CHUAN(4);

    private final int number;

    CuisineEnum(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
