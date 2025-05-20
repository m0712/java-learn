package com.menshu.test04;

import com.menshu.test02.MyRunnable;

public class ThreadName {
    public static void main(String[] args) {
        ThreadName threadName = new ThreadName();
        threadName.test();
        threadName.test2();

    }
    public void test(){
        Thread thread = new Thread("张三的线程") {
            @Override
            public void run(){
                System.out.println("run by: " + getName());
            }
        };
        thread.start();
        System.out.println(thread.getName());
    }

    public void test2(){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"李四的线程");
        thread.start();
        System.out.println(thread.getName());
    }
}
