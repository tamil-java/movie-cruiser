package com.cognizant.movie.dao;

import java.util.List;

import com.cognizant.movie.model.Movies;

public interface FavoriteDao {

    public List<Movies> getAllFavorites(long userId);

    public void addFavoritesById(long userId, long movieId);

    public void removeFavoritesById(long userId, long movieId);

}
