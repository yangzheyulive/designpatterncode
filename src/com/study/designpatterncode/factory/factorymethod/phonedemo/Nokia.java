package com.study.designpatterncode.factory.factorymethod.phonedemo;

/**
 * 诺基亚手机：实现手机接口
 *
 * @author Joe
 * @create 2017-12-05 16:43
 **/

public class Nokia implements Mobile {
    @Override
    public void Call() {
        System.out.println("诺基亚手机");
    }
}
