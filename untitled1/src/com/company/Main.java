package com.company;

public class Main {

    public static void main(String[] args) {
        Moveable car1 = new Car(400, Color.RED, "Honda");
        Car car2 = new Car(200, Color.BLACK, "BMW");
        car1.move();
        car1.stop();
        Car.invokeStaticMethod();
        System.out.println("Car color: " + car2.getColor());
        System.out.println("Car engine power: " + car2.getEnginePower());
        System.out.println(car2);
    }
}
