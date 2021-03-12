package ru.tinkoff.fintech.homework;

public class Box<T> {

    private T element;


    public T get() {
        return element;
    }
    public void put(T element) {
        this.element = element;
    }
}
