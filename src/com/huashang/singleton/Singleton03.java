package com.huashang.singleton;

/**
 * 静态内部类单例模式
 * Created by Administrator on 16-4-2.
 */
public class Singleton03 {

    private static class SingletonClassInstance {
        private static final Singleton03 instance = new Singleton03();
    }

    private Singleton03() {
    }

    public static Singleton03 getSinletonInstance() {
        return SingletonClassInstance.instance;
    }
}
