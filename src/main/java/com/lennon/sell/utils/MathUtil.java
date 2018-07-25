package com.lennon.sell.utils;

public class MathUtil {
    public static final Double Money_Range =0.01;
    /**
     * 比较二个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1,Double d2){
        Double result = Math.abs(d1-d2);

        return result < Money_Range;
    }
}
