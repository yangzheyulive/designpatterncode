package com.study.designpatterncode.factory.simplefactory;

/**
 * 具体电子支付类，万事达卡
 */
public class MasterCard extends ETF {
    @Override
    void process() {
        System.out.println("万事达卡处理中...");
    }
}
