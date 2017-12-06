package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 定义AMD类，实现CPU接口
 *
 * @author Joe
 * @create 2017-12-05 18:03
 **/

public class AMD implements Cpu {

    @Override
    public String designCPU() {
        return "Athlon XP 2800+";
    }
}
