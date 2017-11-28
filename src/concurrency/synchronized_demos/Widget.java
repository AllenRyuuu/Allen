package concurrency.synchronized_demos;

import pub_utils.PubUtils;

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
public class Widget {
    public synchronized void doSth() {
        System.out.println(Thread.currentThread().getName() + ": calling Widget doSomething");
        PubUtils.countDown(3); // 线程休眠3秒
        System.out.println(Thread.currentThread().getName() + ": leave Widget doSomething");
    }
}
