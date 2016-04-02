package com.huashang.singleton;

/**
 * 懒汉式单例模式
 * Created by Administrator on 16-4-2.
 */
public class Singleton02 {

    private static Singleton02 instance ;

    private Singleton02() {
    }

    public static Singleton02 getSinletonInstance() {
        if(instance == null) {
            return new Singleton02();
        }
    }
}
