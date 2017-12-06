package com.study.designpatterncode.factory.factorymethod.phonedemo;

/**
 * 摩托罗拉工厂：实现生产手机的方法，返回摩托罗拉手机
 *
 * @author Joe
 * @create 2017-12-05 16:45
 **/

public class MotorolaFactory implements MobileFactory {
    @Override
    public Mobile produceMobile() {
        System.out.println("摩托罗拉工厂制造了");
        return new Motorola();
    }
}
