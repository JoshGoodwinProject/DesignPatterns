package com.joshgoodwinproject.abstractfactorypattern;

/**
 * Created by Josh on 10/10/2016.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String name){
        if(name.equals("Sport"))
            return new SportFactory();
        if(name.equals("Game"))
            return new GameFactory();
        return null;
    }
}
