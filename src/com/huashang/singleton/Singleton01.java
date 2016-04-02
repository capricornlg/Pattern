package com.huashang.singleton;

/**
 * 饿汉式单例模式
 * Created by Administrator on 16-4-2.
 */
public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getSinletonInstance() {
        return instance;
    }
}
