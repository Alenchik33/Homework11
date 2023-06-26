package ru.netology.manager;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        limit = 5;
    }

    public MovieManager(int limit) {

        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultlength;
        if (movies.length < 5) {
            resultlength = movies.length;
        } else {
            resultlength = 5;
        }
            String[] tmp = new String[resultlength];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = movies[movies.length - 1 - i];
            }
            return tmp;
        }

    }