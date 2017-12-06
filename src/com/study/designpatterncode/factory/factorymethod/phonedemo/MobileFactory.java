package com.study.designpatterncode.factory.factorymethod.phonedemo;

/**
 * 手机接口工厂
 *
 * @author Joe
 * @create 2017-12-05 16:39
 **/

public interface MobileFactory {
    /**
     * 工厂方法，生产手机
     * 适用场景：
     * 1、基于工厂角色和产品角色的多态性设计是工厂方法模式的关键
     * 2、优秀的面向对象设计鼓励使用封装(Encapsulation)和委托(Delegation)来构造软件系统，工厂方法模式正是使用了封装和委托的典型例子，其中封装是通过抽象工厂来体现的，而委托则是通过抽象工厂将创建对象的责任完成交给具体工厂来体现
     * 缺点：使用工厂方法模式的缺点是在添加新产品时，需要编写新的具体产品类，而且还要提供与之对应的具体工厂类，当两者都比较简单时，系统会有相对额外的开销。
     */
    public Mobile produceMobile();
}
