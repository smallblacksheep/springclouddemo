package com.yy.cloudeurekamovie.service.impl;

import com.yy.cloudeurekamovie.bean.Movie;
import com.yy.cloudeurekamovie.dao.MovieDao;
import com.yy.cloudeurekamovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieDao movieDao;

    @Override
    public Movie getMovieById(Integer id) {
        return movieDao.getMovieById(id);
    }

    @Override
    public List<Movie> getMovies() {
        return movieDao.getMovies();
    }

}
