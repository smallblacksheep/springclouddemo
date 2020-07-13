package com.yy.cloudeurekauser.service;

import com.yy.cloudeurekauser.bean.Movie;
import com.yy.cloudeurekauser.service.impl.MovieFeginClientExceptionHandker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "CLOUD-EUREKA-MOVIE-FEIGN",fallback = MovieFeginClientExceptionHandker.class)
public interface MovieServiceFegin {

    @GetMapping(value = "/movie/getMovie/{id}")
    public Movie getMovie(@PathVariable(name = "id") Integer id);

}
