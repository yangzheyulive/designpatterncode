package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 狮子
 *
 * @author Joe
 * @create 2017-12-05 17:19
 **/

public class Lion extends Carnivore {
    @Override
    public void eat(Herbivore h) {
        System.out.println(this + " eats " + h);
    }
}
