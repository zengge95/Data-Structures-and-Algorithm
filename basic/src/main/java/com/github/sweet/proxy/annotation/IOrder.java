package com.github.sweet.proxy.annotation;

/**
 * @description
 * @date 2021/4/4 21:23
 */
public interface IOrder {
    void pay() throws InterruptedException;
    void show();
}
