package com.study.designpatterncode.factory.simplefactory;

/**
 * 客户端测试类
 *
 * @author Joe
 * @create 2017-12-05 15:22
 **/

public class Client {
    public static void main(String[] args) {
        ETFFactory etfFactory = new ETFFactory();
        ETF eft = etfFactory.createEFT("VirtualCheck");
        eft.process();
        eft = etfFactory.createEFT("MasterCard");
        eft.process();
    }
}
