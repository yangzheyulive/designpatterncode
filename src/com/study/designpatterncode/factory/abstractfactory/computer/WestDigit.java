package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 定义WestDigit类，实现硬盘接口
 *
 * @author Joe
 * @create 2017-12-05 18:46
 **/

public class WestDigit implements HardDisc {
    @Override
    public String designHardDisc() {
        return "WD2500JD 250G";
    }
}
