package com.joshgoodwinproject.test.abstractfactorypattern;

import com.joshgoodwinproject.abstractfactorypattern.AbstractFactory;
import com.joshgoodwinproject.abstractfactorypattern.FactoryProducer;
import com.joshgoodwinproject.abstractfactorypattern.SportFactory;
import com.joshgoodwinproject.abstractfactorypattern.games.Game;
import com.joshgoodwinproject.abstractfactorypattern.sports.Sport;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Josh on 10/8/2016.
 */
public class AbstractFactoryPatternTest {

    @BeforeClass
    public static void beforeTests(){

    }
    @AfterClass
    public static void afterTests(){

    }

    @Test
    public void factoryPatternTest(){

        //Get all of the sports from the sports factory
        AbstractFactory sportsFactory = FactoryProducer.getFactory("Sport");
        Assert.assertNotNull(sportsFactory);

        Sport football = sportsFactory.getSport("Football");
        Assert.assertTrue(football.score().equals("Touchdown!"));

        Sport Basketball = sportsFactory.getSport("Basketball");
        Assert.assertTrue(Basketball.score().equals("3pts!"));

        Sport swim = sportsFactory.getSport("Swimming");
        Assert.assertTrue(swim.score().equals("Fastest Time!"));

        //get all of the games from the game factory
        AbstractFactory gamesFactory = FactoryProducer.getFactory("Game");

        Game blackjack = gamesFactory.getGame("BlackJack");
        Assert.assertTrue(blackjack.win().equals("21"));

        Game spades = gamesFactory.getGame("Spades");
        Assert.assertTrue(spades.win().equals("500"));

        Game ticTacToe = gamesFactory.getGame("TicTacToe");
        Assert.assertTrue(ticTacToe.win().equals("3 in a row!"));

    }
}
