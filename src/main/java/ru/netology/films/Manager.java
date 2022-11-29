package ru.netology.films;

public class Manager {

    private Film[] films = new Film[0];
    private int limitLastFilm = 10;

    public Manager() {

    }

    public Manager(int newLimit) {
        this.limitLastFilm = newLimit;
    }

    public void add(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public Film[] findAll() {
        return films;
    }

    public int getLimitLastFilm() {
        return limitLastFilm;
    }

    public Film[] findLast() {
        int resultLength;

        if (films.length >= getLimitLastFilm()) {
            resultLength = getLimitLastFilm();
        } else {
            resultLength = films.length;
        }

        Film[] filmsLast = new Film[resultLength];

        for (int i = 0; i < getLimitLastFilm(); i++) {
            filmsLast[i] = films[films.length - 1 - i];
        }

        return filmsLast;
    }

}
