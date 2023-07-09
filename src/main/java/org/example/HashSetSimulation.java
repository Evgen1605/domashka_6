package org.example;


import java.util.ArrayList;
import java.util.List;

public class HashSetSimulation { // Определение класса HashSetSimulation
    private List<Integer> set; // Определение приватного поля set, представляющего собой список целых чисел

    public HashSetSimulation() { // Конструктор класса HashSetSimulation
        set = new ArrayList<>(); // Создание нового объекта ArrayList и присвоение его set
    }

    public void add(Integer element) { // Метод add добавляет элемент во множество, если он отсутствует
        if (!set.contains(element)) { // Проверка, присутствует ли элемент во множестве
            set.add(element); // Если элемент отсутствует, добавляем его в множество
        }
    }

    public Integer get(int index) { // Метод get возвращает элемент из множества по индексу
        if (index >= 0 && index < set.size()) { // Проверка, находится ли индекс в допустимом диапазоне
            return set.get(index); // Если индекс в допустимом диапазоне, возвращаем элемент из множества
        }
        // Если индекс выходит за пределы диапазона, выбрасываем исключение IndexOutOfBoundsException с информацией об индексе
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + set.size());
    }
    // Переопределение метода toString для вывода множества в виде строки
    @Override
    public String toString() {
        return set.toString();
    }

    public static void main(String[] args) {
        HashSetSimulation hashSet = new HashSetSimulation(); // Создание объекта HashSetSimulation
        // Добавление элементов во множество
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        // Вывод множества на экран
        System.out.println(hashSet.toString());
        // Вывод элементов по индексу
        System.out.println(hashSet.get(0));
        System.out.println(hashSet.get(1));
        System.out.println(hashSet.get(2));
        // Попытка получить элемент с индексом, выходящим за пределы диапазона
        System.out.println(hashSet.get(3)); // Исключение IndexOutOfBoundsException
    }
}
//    В этой программе мы создаем класс HashSetSimulation, который содержит List<Integer> set в качестве внутренней коллекции.
//    Метод add(Integer element) добавляет элемент в коллекцию, только если он отсутствует. Метод toString() просто
//    вызывает аналогичный метод у внутренней коллекции и возвращает полученную строку. Метод get(int index) позволяет
//    получать элементы коллекции по индексу, однако если переданный индекс некорректен, будет выброшено исключение
//    IndexOutOfBoundsException. В методе main() создается экземпляр класса HashSetSimulation, добавляются элементы и выводятся на экран.