package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 主板微星MSIKN2G，支持AMD的CPU
 *
 * @author Joe
 * @create 2017-12-05 18:56
 **/

public class MSIK7N2G implements MainBoard {
    @Override
    public void Attach(Cpu cpu) throws Exception {
        if("com.study.designpatterncode.factory.abstractfactory.computer.amd".equals(cpu.getClass().getName().toLowerCase())){
            System.out.println("MSIK7N2G");
        } else {
            throw new Exception("主板MSIK7NG只能配AMD的CPU");
        }
    }
}
