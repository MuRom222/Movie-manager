package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {
    @Test
    public void ShouldAddFilms() {
        ManagerFilms manager = new ManagerFilms(3);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldNotAddFilmsOverLimit() {
        ManagerFilms manager = new ManagerFilms(5);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

        Assertions.assertArrayEquals(expected, actual);
    }

}
