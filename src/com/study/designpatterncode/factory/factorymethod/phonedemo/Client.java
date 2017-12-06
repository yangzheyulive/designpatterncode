package com.study.designpatterncode.factory.factorymethod.phonedemo;

/**
 * 测试类
 *
 * @author Joe
 * @create 2017-12-05 16:51
 **/

public class Client {
    public static void main(String[] args) {
        MobileFactory mf = new MotorolaFactory();
        Mobile phone = mf.produceMobile();
        phone.Call();

        mf = new NokiaFactory();
        phone = mf.produceMobile();
        phone.Call();
    }
}
