package ru.netology.domain;

public class MovieManager {
    private int limit = 5;
    private String[] movies = new String[0];

    public MovieManager(int limit) {

        this.limit = limit;
    }

    public MovieManager() {

    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findLastFive() {
        int resultlength;
        if (movies.length < limit) {
            resultlength = movies.length;
        } else {
            resultlength = limit;
        }
        String[] tmp = new String[resultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

    public String[] findAll() {
        int resultlength = movies.length;
        if (resultlength >= limit) {
            resultlength = limit;
        } else {
            resultlength = movies.length;
        }
        String[] result = new String[resultlength];
        for (int i = 0; i < resultlength; i++) {
            result[i] = movies[i];
        }
        return result;
    }
}