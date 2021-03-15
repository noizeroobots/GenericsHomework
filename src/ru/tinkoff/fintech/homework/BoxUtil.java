package ru.tinkoff.fintech.homework;


public class BoxUtil<T> {
    protected T element;

    // скопировать содержимое из одной коробки в другую
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public void copyFromBoxToBox(Box<? extends T> src, Box<? super T> dest) {
        this.element = src.get();
        dest.put(this.element);

    }

//     скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
//     при условии, что содержащийся фрукт свежий (fresh == true).
//    Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static ...

    void copyFreshFruitFromBoxToBox(Box<...>src, Box<...>dest) {
        ...
    }

    //вывести в консоль (toString()) объект второй коробки
    public static ...

    void printElementFromTwoBoxes(Box<...>box) {
       ...
    }

    /**
     * вывести в консоль (toString()) объект последней коробки
     *
     * box Box, которая содержит в себе любое кол-во вложенных Box, в последней из которых может быть любой объект.
     */
    public static ...

    void printElementFromBoxes(Box<...>box) {
        ...
    }
}


