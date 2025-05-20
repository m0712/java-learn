package com.menshu.test03;

import java.util.concurrent.FutureTask;

public class CallableThreadTest {
    public static void main(String[] args) {
        //创建Callable接口的实现类对象
        CallableThread callableThread = new CallableThread();
        //创建FutureTask对象，将Callable实现类对象传递给构造器
        FutureTask<Integer> futureTask = new FutureTask<>(callableThread);
        //创建Thread对象，将FutureTask对象作为Thread对象的target创建Thread对象，启动线程
        new  Thread(futureTask).start();
        //获取Callable线程的返回值
        try{
            Integer result = futureTask.get();
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }


}
