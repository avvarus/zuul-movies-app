package com.example.zuulmoviesapp.controller;


import com.example.zuulmoviesapp.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieIndexController {

    @GetMapping(value = "/getMovies")
    public List<Movie> getMovies(){

        ArrayList moviesList = new ArrayList();

        Movie movie = Movie.builder().name("12 Angry Men").genre("Drama").year(1957).build();
      //  Movie movie = new Movie();
//        movie.setYear(189);
//        movie.setName("Test Movie");
//        movie.setGenre("Test Genre");


        Movie movie1 = Movie.builder().name("Titantic").genre("Drama").year(1998).build();

        moviesList.add(movie);
        moviesList.add(movie1);

        return moviesList;
    }

}
