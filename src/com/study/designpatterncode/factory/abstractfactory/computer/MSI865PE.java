package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 主板微星MSIPE，支持Intel的CPU
 *
 * @author Joe
 * @create 2017-12-05 18:50
 **/

public class MSI865PE implements MainBoard {
    @Override
    public void Attach(Cpu cpu) throws Exception {
        if("com.study.designpatterncode.factory.abstractfactory.computer.intel".equals(cpu.getClass().getName().toLowerCase())){
            System.out.println("MSI865PE");
        } else {
            throw new Exception("主板MSI865PE只能配Intel的CPU");
        }
    }
}
