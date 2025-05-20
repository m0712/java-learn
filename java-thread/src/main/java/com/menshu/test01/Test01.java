package com.menshu.test01;

public class Test01 {
    public static void main(String[] args) {
        Test01 test = new Test01();
        test.test1();
        test.test2();
    }
    /**
     * 测试线程的启动和执行
     * 此方法演示了如何创建和启动一个自定义线程
     */
    public void test1(){
        // 创建一个MyThread的实例
        MyThread myThread= new MyThread();

        // 启动线程。start()方法将初始化线程并使其进入可运行状态
        // start()调用将在线程启动后立即返回。它不会等到run()方法完成
        // 如果由不同的CPU执行，run()方法将执行。当run()方法执行时，它将打印出文本“MyThread run”
        myThread.start();
    }

    /**
     * 测试线程的创建和运行
     * 创建Thread的匿名子类
     */
    public void test2(){
        // 创建一个新的线程实例
        Thread thread = new Thread(){
            /**
             * 线程的入口点
             * 当线程启动时，此方法将被执行
             */
            @Override
            public void run(){
                System.out.println("thread is run ");
            }
        };

        thread.start();
    }

}
