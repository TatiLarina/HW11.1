package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Film film1 = new Film("Зеленая миля", "драма", "1999");
    Film film2 = new Film("Список Шиндлера", "драма", "1993");
    Film film3 = new Film("Побег из Шоушенка", "драма", "1994");
    Film film4 = new Film("Форест Гамп", "драма", "1994");
    Film film5 = new Film("Властелин Колец: Возвращение короля", "фентези", "2001");
    Film film6 = new Film("Тайна Коко", "мультфильм", "2017");
    Film film7 = new Film("Назад в будущее", "фантастика", "1985");
    Film film8 = new Film("Интерстеллар", "фантастика", "2014");

    @Test
    public void testAdd() {
        Manager manager = new Manager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        Film[] expected = {film1, film2, film3};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFilmsLastIfMore() {

        Manager manager = new Manager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        Film[] expected = {film8, film7, film6, film5, film4};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFilmsLastIfLess() {

        Manager manager = new Manager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);


        Film[] expected = {film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFilmsLastIfEqual() {

        Manager manager = new Manager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        Film[] expected = {film5, film4, film3, film2, film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFilmsLastIfOne() {

        Manager manager = new Manager(5);

        manager.add(film1);

        Film[] expected = {film1};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFilmsLastIfNull() {

        Manager manager = new Manager(5);

        Film[] expected = {};
        Film[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
