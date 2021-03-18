package ru.tinkoff.fintech.homework;
/** Пункт 3. */
public class Box<T extends Fruit> {

    private T fruit;

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public Box() {

    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
}
