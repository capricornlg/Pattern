package com.huashang.factory;

/**
 * Created by Administrator on 16-4-2.
 */
public class CarFactory {

    public static Car getAudiCar() {
        return new Audi();
    }

    public static Car getBydCar() {
        return new Byd();
    }
}
