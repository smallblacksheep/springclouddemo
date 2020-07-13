package com.yy.cloudeurekamovie.service;

import com.yy.cloudeurekamovie.bean.Movie;

import java.util.List;

public interface MovieService {

    public Movie getMovieById(Integer id);

    public List<Movie> getMovies();
}
