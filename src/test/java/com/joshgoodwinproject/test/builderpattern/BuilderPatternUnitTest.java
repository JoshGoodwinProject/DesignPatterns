package com.joshgoodwinproject.test.builderpattern;

import com.joshgoodwinproject.builderpattern.Meal;
import com.joshgoodwinproject.builderpattern.MealBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Josh on 11/19/2016.
 */
public class BuilderPatternUnitTest {

    //TODO: make this test better, currently from https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
    @Test
    public void BuilderPatternTest(){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

    }

}
