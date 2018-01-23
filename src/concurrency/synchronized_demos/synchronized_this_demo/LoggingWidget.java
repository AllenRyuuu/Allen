package concurrency.synchronized_demos.synchronized_this_demo;

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
public class LoggingWidget extends Widget implements Runnable{
    @Override
    public void run() {
        doSth();
    }

    @Override
    public void doSth() {
        synchronized (LoggingWidget.class) { //同步synchronized(*.class)代码块的作用其实和synchronized static方法作用一样。Class锁对类的所有对象实例起作用。
            System.out.println(Thread.currentThread().getName() + ": calling LoggingWidget doSomething and get Lock");
            PubUtils.countDown(3); // 线程休眠3秒
            super.doSth();
            System.out.println(Thread.currentThread().getName() + ": leave LoggingWidget doSomething");
        }
    }

    public static void main(String[] args) {
        LoggingWidget lw = new LoggingWidget();
        Thread t1 = new Thread(lw,"乌龟"); // 创建叫乌龟的线程，传入lw
        Thread t2 = new Thread(lw,"兔子"); // 创建叫兔子的线程，传入lw
        t1.start(); // 启动线程
        t2.start();

        /*LoggingWidget lw1 = new LoggingWidget();
        LoggingWidget lw2 = new LoggingWidget();

        Thread t1 = new Thread(lw1,"乌龟");
        Thread t2 = new Thread(lw2,"兔子");
        t1.start(); // 启动线程
        t2.start();*/
    }

}
