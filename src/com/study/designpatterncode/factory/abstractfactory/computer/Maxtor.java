package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 定义Maxtor类，实现硬盘接口
 *
 * @author Joe
 * @create 2017-12-05 18:44
 **/

public class Maxtor implements HardDisc {

    @Override
    public String designHardDisc() {
        return "MaXLine Pus II 200G";
    }
}
