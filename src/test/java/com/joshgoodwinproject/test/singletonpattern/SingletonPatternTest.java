package com.joshgoodwinproject.test.singletonpattern;


import com.joshgoodwinproject.singletonpattern.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Josh on 10/10/2016.
 */
public class SingletonPatternTest {

    @Test
    public void singletonPatternTest(){
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        Assert.assertNotNull(log1);
        Assert.assertNotNull(log2);
        Assert.assertEquals(log1, log2);

    }

}
