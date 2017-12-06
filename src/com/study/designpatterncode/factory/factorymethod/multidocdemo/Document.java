package com.study.designpatterncode.factory.factorymethod.multidocdemo;

import java.util.ArrayList;

/**
 * 工厂抽象类
 * 这是一个多文档生成的案例
 * @author Joe
 * @create 2017-12-05 15:41
 **/

public abstract class Document {
    protected ArrayList<Page> pages = new ArrayList<>();

    public  Document(){
        this.createPages();
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public  abstract void  createPages();
}
