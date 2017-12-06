package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 美洲大陆，有野牛、狼
 *
 * @author Joe
 * @create 2017-12-05 17:26
 **/

public class AmericaFactory extends ContinentFactory {
    @Override
    public Herbivore createHerbivore() {
        return new Bison();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Wolf();
    }
}
