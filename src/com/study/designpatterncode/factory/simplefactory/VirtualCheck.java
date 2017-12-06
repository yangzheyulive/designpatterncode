package com.study.designpatterncode.factory.simplefactory;

/**
 * 具体电子付款类的子类，虚拟支票
 */
public class VirtualCheck extends ETF {
    @Override
    void process() {
        System.out.println("虚拟支票处理中...");
    }
}
