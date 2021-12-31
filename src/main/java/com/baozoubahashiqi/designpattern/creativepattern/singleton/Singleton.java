package com.baozoubahashiqi.designpattern.creativepattern.singleton;

/**
 * @author 暴走吧哈士奇
 */
public class Singleton {

    //饿汉式
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
