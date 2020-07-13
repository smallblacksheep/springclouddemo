package com.yy.cloudeurekamovie.controller;

import com.yy.cloudeurekamovie.bean.Movie;
import com.yy.cloudeurekamovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Value("${server.port}")
    Integer port;

    @Autowired
    MovieService movieService;

    @GetMapping(value = "/getMovie/{id}")
    public Movie getMovie(@PathVariable(name = "id") Integer id){
        System.out.println("getMovie....当前服务端口:"+port);
        return movieService.getMovieById(id);
    }

    @GetMapping(value = "/getMovie")
    public List<Movie> getMovie(){
        return movieService.getMovies();
    }

}
