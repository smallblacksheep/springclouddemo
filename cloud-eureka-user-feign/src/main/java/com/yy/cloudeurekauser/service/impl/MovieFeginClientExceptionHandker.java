package com.yy.cloudeurekauser.service.impl;

import com.yy.cloudeurekauser.bean.Movie;
import com.yy.cloudeurekauser.service.MovieServiceFegin;
import org.springframework.stereotype.Service;

@Service
public class MovieFeginClientExceptionHandker implements MovieServiceFegin {

    @Override
    public Movie getMovie(Integer id) {
        return new Movie(-100,"未找到相关电影信息......");
    }
}
