package com.joshgoodwinproject.singletonpattern;

/**
 * Created by Josh on 10/10/2016.
 */
public class Logger {

    private static Logger instance = null;

    private Logger(){}

    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public static String log(String msg){
        return msg;
    }
}
