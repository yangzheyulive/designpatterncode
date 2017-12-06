package com.study.designpatterncode.factory.simplefactory;

/**
 * 电子支付的工厂类
 * 简单工厂适用的场景：
 * 1、工厂类负责创建的对象比较少。
 * 2、客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心。
 * 缺点：由于简单工厂很容易违反GRASP的高内聚责任分配原则，因此一般只在很简单的情况下应用。
 * @author Joe
 * @create 2017-12-05 15:16
 **/

public class ETFFactory {
    public ETF createEFT(String type){
        switch (type.toLowerCase()){
            case "virtualcheck":
                return new VirtualCheck();
            case "mastercard":
                return new MasterCard();
            default:
                return null;
        }
    }
}
