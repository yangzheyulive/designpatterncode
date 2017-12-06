package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 非洲大陆，有角马、狮子
 *
 * @author Joe
 * @create 2017-12-05 17:24
 **/

public class AfricaFactory extends ContinentFactory {
    @Override
    public Herbivore createHerbivore() {
        return new Wildebeest();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Lion();
    }
}
