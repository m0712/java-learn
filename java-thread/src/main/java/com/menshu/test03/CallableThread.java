package com.menshu.test03;

import java.util.concurrent.Callable;
//1.创建一个实现Callable的实现类, 可以通过设置泛型，指定call方法返回的类型
public class CallableThread implements Callable<Integer> {
    //2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}

