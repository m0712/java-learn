package com.menshu.test02;

public class MyRunnableTest {

//    Runnable的run()方法的执行方式与您预期的一样。
//    但是，它不是由您刚刚创建的新线程执行的。相反，run()方法是由创建线程的线程执行的。
//    换句话说，执行上述两行代码的线程。要让MyRunnable实例的run()方法由新创建的线程newThread调用，您必须调用newThread.start()方法。
    public static void main(String[] args) {
        MyRunnableTest test = new MyRunnableTest();

        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(test.test());
        Thread thread2 = new Thread(test.test2());
        Thread thread3 = new Thread(test.test3());
        thread1.start();
        thread2.start();
        thread3.start();

    }
    //实现Runnable接口
    public Runnable test(){
        MyRunnable myRunnable= new MyRunnable();

        return myRunnable;
    }

    //实现Runnable接口的匿名Java类
    public Runnable test2(){
        Runnable myRunnable =
            new Runnable(){
                @Override
                public void run(){
                    System.out.println("Runnable running 2");
                }
            };
        return myRunnable;
    }

    //实现Runnable接口的第三种方法是创建Runnable接口的JavaLambda实现。
    // 因为Runnable接口只有一个未实现的方法，并且thereforepractically（尽管可能是无意的）是一个功能Java接口。
    public Runnable test3(){
        Runnable runnable = () -> {
            System.out.println("Lambda Runnable running 3");
        };
        return runnable;
    }
}
