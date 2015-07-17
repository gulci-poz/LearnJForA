package com.gulci;

public class Main {

    public static void main(String[] args) {

        Trivial trivialObj = new Trivial(10);
        Trivial noArgTrivial = new Trivial();
        trivialObj.incr();
        trivialObj.printCounter();
        noArgTrivial.printCounter();

        // polimorfizm
        // przypisujemy obiektowi bazowej klasy obiekt jego podklasy
        Car auto = new Car();
        auto.drive();
        auto = new Ragtop();
        auto.drive();

        /* z nadrzędnego nie da się zrobić podrzędnego
        // funAuto zawiera obiekt typu Car
        Ragtop funCar;
        Car funAuto = new Car();
        funCar = (Ragtop) funAuto;
        funAuto.drive();
        */

        Car funAuto;
        funAuto = new Ragtop();
        // rzutowanie się uda, bo funAuto zawiera tak naprawdę typu Ragtop
        Ragtop funCar = (Ragtop) funAuto;
        funAuto.drive();

        // tutaj podobna sytuacja jak wyżej, pod obiektami Car mamy obiekty Ragtop
        JoyRide ride = new JoyRide();
        ride.letsGo();

        // 80.1 - Final and Static Declarations
    }
}