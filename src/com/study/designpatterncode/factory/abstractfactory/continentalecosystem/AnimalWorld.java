package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 动物世界
 *
 * @author Joe
 * @create 2017-12-05 17:22
 **/

public class AnimalWorld {
    private  Herbivore herbivore;
    private  Carnivore carnivore;

    public  AnimalWorld(ContinentFactory factory){
        herbivore = factory.createHerbivore();
        carnivore = factory.createCarnivore();
    }

    public  void runFoodChain(){
        carnivore.eat(herbivore);
    }
}
