package com.joshgoodwinproject.abstractfactorypattern;

import com.joshgoodwinproject.abstractfactorypattern.games.BlackJack;
import com.joshgoodwinproject.abstractfactorypattern.games.Game;
import com.joshgoodwinproject.abstractfactorypattern.games.Spades;
import com.joshgoodwinproject.abstractfactorypattern.games.TicTacToe;
import com.joshgoodwinproject.abstractfactorypattern.sports.Sport;

/**
 * Created by Josh on 10/10/2016.
 */
public class GameFactory extends AbstractFactory {

    public Sport getSport(String name) {
        return null;
    }
    public Game getGame(String name) {
        if(name == null){
            return null;
        }
        if (name.equals("BlackJack")){
            return new BlackJack();
        }
        if(name.equals("Spades")){
            return new Spades();
        }
        if(name.equals("TicTacToe")){
            return new TicTacToe();
        }
        return null;
    }
}
