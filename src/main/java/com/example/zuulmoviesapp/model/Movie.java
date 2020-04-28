package com.example.zuulmoviesapp.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//@NoArgsConstructor
public class Movie {

    private String name;
    private String genre;
    private int year;
}
