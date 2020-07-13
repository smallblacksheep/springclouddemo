package com.yy.cloudeurekauser.bean;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer id;
    private String movieName;

    public Movie() {
    }

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie(Integer id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
