package com.gulci;

public class Trivial {

    private int counter;

    // kaskadowanie konstruktora;
    // istnieją przypadki, kiedy musimy zdefiniować konstruktor bez argumentu (np. dla JUnit)

    public Trivial() {
        this(0);
    }

    public Trivial(int initCounter) {
        counter = initCounter;
    }

    public void incr() {
        counter++;
    }

    public void printCounter() {
        System.out.println(counter);
    }
}