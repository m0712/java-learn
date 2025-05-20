package com.menshu.test04;

public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("我是子线程: "+i);
        }
    }
}
