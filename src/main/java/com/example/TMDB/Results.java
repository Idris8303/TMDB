package com.example.TMDB;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties

public class Results {
    List<Movie> results;

    public Results() {

    }

    public  List<Movie> getResults() {
        return results;
    }

    public void setResult(List<Movie> result) { this.results = results;}
}
