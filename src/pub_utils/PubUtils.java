package pub_utils;

/**
 * Project: CCC Web Suite
 * <p>
 * Created by c_liuwentao on 2017/11/27.
 * <p>
 * Copyright 2017 CCC Corporation Limited.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of
 * CCC Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with http://ccc.cccis.com/
 */
public class PubUtils {

    /**
     * sleep倒计时工具
     * @param num 休眠时间
     */
    public static void countDown(int num) {
        while (num > 0) {
            try {
                System.out.println("倒计时:" + num + "s");
                Thread.sleep(1000);
                num--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("倒计时结束");
    }
}
