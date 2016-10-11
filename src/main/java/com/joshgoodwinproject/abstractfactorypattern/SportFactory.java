package com.joshgoodwinproject.abstractfactorypattern;

import com.joshgoodwinproject.abstractfactorypattern.games.Game;
import com.joshgoodwinproject.abstractfactorypattern.sports.Basketball;
import com.joshgoodwinproject.abstractfactorypattern.sports.Football;
import com.joshgoodwinproject.abstractfactorypattern.sports.Sport;
import com.joshgoodwinproject.abstractfactorypattern.sports.Swimming;

/**
 * Created by Josh on 10/9/2016.
 */
public class SportFactory extends AbstractFactory{

    public Sport getSport(String name){
        if(name == null){
            return null;
        }
        if (name.equals("Basketball")){
            return new Basketball();
        }
        if(name.equals("Football")){
            return new Football();
        }
        if(name.equals("Swimming")){
            return new Swimming();
        }
        return null;
    }

    public Game getGame(String name){
        return null;
    }
}
