package com.example.learn_spring;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}
