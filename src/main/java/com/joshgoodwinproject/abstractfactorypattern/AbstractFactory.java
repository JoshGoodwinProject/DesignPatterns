package com.joshgoodwinproject.abstractfactorypattern;

import com.joshgoodwinproject.abstractfactorypattern.games.Game;
import com.joshgoodwinproject.abstractfactorypattern.sports.Sport;

/**
 * Created by Josh on 10/9/2016.
 */
public abstract class AbstractFactory {

    public abstract Sport getSport(String name);
    public abstract Game getGame(String name);

}
