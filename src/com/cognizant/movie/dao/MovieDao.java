package com.cognizant.movie.dao;

import java.util.List;

import com.cognizant.movie.model.Movies;

public interface MovieDao {
    public Movies getMovieById(long movieId);

    public void editMovieList(Movies movieList);

    public List<Movies> getMovieListAdmin();

    public List<Movies> getMovieListCustomer();

}
