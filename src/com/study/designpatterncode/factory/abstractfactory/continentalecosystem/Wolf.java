package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 狼
 *
 * @author Joe
 * @create 2017-12-05 17:21
 **/

public class Wolf extends Carnivore {
    @Override
    public void eat(Herbivore h) {
        System.out.println(this + " eats " + h);
    }
}
