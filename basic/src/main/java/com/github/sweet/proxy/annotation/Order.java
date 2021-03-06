package com.github.sweet.proxy.annotation;

/**
 * @description
 * @date 2021/4/4 21:24
 */
@Aspect(type = TimeUsageAspect.class)
public class Order implements IOrder {
    private int state = 0;

    @Override
    public void pay() throws InterruptedException {
        Thread.sleep(50);
        this.state = 1;
    }

    @Override
    public void show() {
        System.out.println("this pay state: " + state);
    }
}
