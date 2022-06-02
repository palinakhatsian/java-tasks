package com.company;

public class Main {

    public static void main(String[] args) {
        Flyable test1 = new Bird();
        Flyable test2 = new Sparrow();
        Bird test3 = new Sparrow();
        Bird test4 = new Bird();
        test3.fly();
        test4.fly();
    }
}
