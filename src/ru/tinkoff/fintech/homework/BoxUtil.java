package ru.tinkoff.fintech.homework;

public class BoxUtil<T> {

    protected Apple apple = new Apple();
    protected Fruit fruit = new Fruit();
    protected Box box = new Box();

    public void copyFromBoxToBox(Box<? extends Fruit> src, Box<? super Fruit> dest) {
        this.fruit = src.getFruit();
        dest.setFruit(this.apple);
    }

    public void copyFreshFruitFromBoxToBox(Box<? extends Fruit> src, Box<? super Fruit> dest) {
        if(fruit.isFresh()){
            this.fruit = src.getFruit();
            dest.setFruit(this.apple);
        }
    }

    public static <Fruit> void printElementFromTwoBoxes(Box<? super Fruit> box) {
        System.out.println(box.toString());
    }

    public static <T extends Fruit> void printElementFromBoxes(Box<? super Fruit> box) {
        System.out.println(box.toString());
    }
}

