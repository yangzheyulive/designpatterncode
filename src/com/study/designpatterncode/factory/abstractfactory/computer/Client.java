package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 测试类
 *
 * @author Joe
 * @create 2017-12-05 19:14
 **/

public class Client {
    public static void main(String[] args) {
        IBM ibm = new IBM();
        ibm.Show();

        Dell dell = new Dell();
        dell.Show();
    }
}
