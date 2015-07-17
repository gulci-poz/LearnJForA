package com.gulci;

public class Main {

    public static void main(String[] args) {

        Trivial trivialObj = new Trivial(10);
        Trivial noArgTrivial = new Trivial();
        trivialObj.incr();
        trivialObj.printCounter();
        noArgTrivial.printCounter();
    }
}