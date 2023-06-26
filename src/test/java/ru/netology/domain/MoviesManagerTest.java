package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.MovieManager;


public class MoviesManagerTest {

    @Test
    public void shouldAddMovie() {
        MovieManager movie = new MovieManager();


        movie.addMovie("Film1");


        String[] expected = { "Film1" };
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        MovieManager movie = new MovieManager();
        String[] expected = {};
        String[] actual = movie.findAll();

        Assertions. assertArrayEquals(expected, actual);
    }
@Test
public void add3Films(){
    MovieManager movie = new MovieManager();
    movie.addMovie ("Film1");
    movie.addMovie ("Film2");
    movie.addMovie ("Film3");
    String[] expected = {"Film1","Film2", "Film3"};
    String[] actual = movie.findAll();
}
    @Test
    public void shouldFindAllLimit() {
        MovieManager movie = new MovieManager();

        movie.addMovie("Film1");
        movie.addMovie("Film2");
        movie.addMovie("Film3");
        movie.addMovie("Film4");
        movie.addMovie("Film5");


        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimit() {
        MovieManager movie = new MovieManager();

        movie.addMovie("Film1");
        movie.addMovie("Film2");
        movie.addMovie("Film3");
        movie.addMovie("Film4");
        movie.addMovie("Film5");
        movie.addMovie("Film6");



        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit5() {
        MovieManager movie = new MovieManager(5);

        movie.addMovie("Film1");
        movie.addMovie("Film2");
        movie.addMovie("Film3");
        movie.addMovie("Film4");
        movie.addMovie("Film5");
        movie.addMovie("Film6");
        movie.addMovie("Film7");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastFiveLimit() {
        MovieManager movie = new MovieManager();

        movie.addMovie("Film1");
        movie.addMovie("Film2");
        movie.addMovie("Film3");
        movie.addMovie("Film4");
        movie.addMovie("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastSevenLimit5() {
        MovieManager movie = new MovieManager(3);

        movie.addMovie("Film1");
        movie.addMovie("Film2");
        movie.addMovie("Film3");



        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}