package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 抽象大陆工厂
 *
 * @author Joe
 * @create 2017-12-05 17:06
 **/

public abstract class ContinentFactory {
    /**
     * 生成食草性动物
     * @return
     */
    public abstract Herbivore createHerbivore();

    /**
     * 生成食肉性动物
     * @return
     */
    public abstract Carnivore createCarnivore();
}
