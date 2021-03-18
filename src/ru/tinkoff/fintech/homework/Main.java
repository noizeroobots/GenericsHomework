package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(String[] args) {


        Apple apple = new Apple();
        Box<Apple> box = new Box<Apple>(apple);
        BoxUtil boxUtil = new BoxUtil();


        box.getFruit().isFresh();
        boxUtil.;



    }
}
