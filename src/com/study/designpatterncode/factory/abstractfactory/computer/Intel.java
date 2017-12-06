package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 定义Intel类，实现CPU接口
 *
 * @author Joe
 * @create 2017-12-05 18:04
 **/

public class Intel implements Cpu {

    @Override
    public String designCPU() {
        return "奔腾4 3.2C";
    }
}
