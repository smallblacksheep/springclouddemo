package com.yy.cloudeurekamovie.dao;

import com.yy.cloudeurekamovie.bean.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieDao {
    private static List<Movie> movies = new ArrayList<>();
    static {
        movies.add(new Movie(1,"三傻大闹宝莱坞"));
        movies.add(new Movie(2,"天気の子"));
        movies.add(new Movie(3,"君の名は"));
        movies.add(new Movie(4,"千と千尋"));
        movies.add(new Movie(5,"言葉の庭"));
        movies.add(new Movie(6,"彼女と彼女の猫"));
        movies.add(new Movie(7,"蛍の森"));
    }

    /**
     * 根据id获取指定电影对象
     * @param id
     * @return
     */
    public Movie getMovieById(Integer id){
        return movies.get(id-1);
    }

    /**
     * 获取电影列表
     * @return
     */
    public List<Movie> getMovies(){
        return movies;
    }

}
