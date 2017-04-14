package org.seckill.log;

import java.util.Random;

/**
 * Created by andy on 14/04/2017.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        while(true) {
            bar();
            foo();
        }
    }

    private static void bar() throws InterruptedException {
        Thread.sleep(5000);
        Random random=new Random();
        System.out.println("sleep: "+random.nextInt(1000));
    }
    private static void foo() throws InterruptedException {
        Random random=new Random();
        System.out.println("sleep: "+random.nextInt(1000));
        Thread.sleep(1000);
    }

}
