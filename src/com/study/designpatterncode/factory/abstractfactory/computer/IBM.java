package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 抽象电脑工厂派生类IBM，定义其返回的系列配件产品
 *
 * @author Joe
 * @create 2017-12-05 19:10
 **/

public class IBM extends ComputerFactory {
    public  IBM(){
        iCpu = new Intel();
        iHD = new WestDigit();
        iMB = new MSI865PE();
    }
}
