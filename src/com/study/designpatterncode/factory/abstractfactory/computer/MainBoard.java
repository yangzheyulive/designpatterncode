package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 定义主板接口，包含参数为CPU的公共方法Attach()
 *
 * @author Joe
 * @create 2017-12-05 18:47
 **/

public interface MainBoard {
    void Attach(Cpu cpu) throws Exception;
}
