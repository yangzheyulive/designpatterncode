package com.study.designpatterncode.factory.abstractfactory.continentalecosystem;

/**
 * 测试类
 *
 * @author Joe
 * @create 2017-12-05 17:28
 **/

public class Client {
    public static void main(String[] args) {
        //创造并运行非洲动物世界
        ContinentFactory africa = new AfricaFactory();
        AnimalWorld world = new AnimalWorld(africa);
        world.runFoodChain();

        //创造并运行美洲动物世界
        ContinentFactory america = new AmericaFactory();
        world = new AnimalWorld(america);
        world.runFoodChain();
    }
}
