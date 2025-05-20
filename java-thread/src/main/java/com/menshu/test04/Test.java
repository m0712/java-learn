package com.menshu.test04;

public class Test
{
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        for (int i = 0; i < 6; i++) {
            System.out.println("main任务:主线程执行："+i);
        }
    }
}
