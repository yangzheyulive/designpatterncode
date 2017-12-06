package com.study.designpatterncode.factory.factorymethod.phonedemo;

/**
 * 诺基亚工厂：实现生产手机的方法，返回诺基亚手机
 *
 * @author Joe
 * @create 2017-12-05 16:48
 **/

public class NokiaFactory implements MobileFactory {
    @Override
    public Mobile produceMobile() {
        System.out.println("诺基亚工厂制造了");
        return new Nokia();
    }
}
