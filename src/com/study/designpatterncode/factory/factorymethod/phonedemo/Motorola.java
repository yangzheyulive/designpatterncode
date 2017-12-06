package com.study.designpatterncode.factory.factorymethod.phonedemo;

/**
 * 摩托罗拉手机：实现手机接口
 *
 * @author Joe
 * @create 2017-12-05 16:41
 **/

public class Motorola implements  Mobile {
    @Override
    public void Call() {
        System.out.println("摩托罗拉手机");
    }
}
