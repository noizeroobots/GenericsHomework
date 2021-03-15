package ru.tinkoff.fintech.homework;
/** Пункт 3. */
public class Box<T> {

    private T element;

    public T get() {
        return element;
    } //достать объект <T> из коробки

    public void put(T element) {
        this.element = element;
    } // положить объект <T> в коробку
}
