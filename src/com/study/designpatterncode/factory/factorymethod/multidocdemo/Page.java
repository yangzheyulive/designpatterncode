package com.study.designpatterncode.factory.factorymethod.multidocdemo;

/**
 * 产品基类
 *
 * @author Joe
 * @create 2017-12-05 15:40
 **/

public abstract class Page {
    protected String name;
    protected void printContext(){
        System.out.println("生成文档的" + name);
    }
}
