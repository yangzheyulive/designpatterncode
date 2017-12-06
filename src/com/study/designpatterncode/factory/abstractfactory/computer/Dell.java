package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 抽象电脑工厂类的派生类DELL，定义其返回的系列配件产品
 *
 * @author Joe
 * @create 2017-12-05 19:12
 **/

public class Dell extends ComputerFactory {
    public  Dell(){
        iCpu = new AMD();
        iHD = new Maxtor();
        iMB = new MSIK7N2G();
    }
}
