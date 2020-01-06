package com.cognizant.movie.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cognizant.movie.model.Favorites;
import com.cognizant.movie.model.Movies;

public class FavoriteDaoCollectionImpl implements FavoriteDao {
    public static HashMap<Long, Favorites> userFavorite;

    public FavoriteDaoCollectionImpl() {
        if (userFavorite == null) {
            userFavorite = new HashMap<Long, Favorites>();
        }
    }

    @Override
    public List<Movies> getAllFavorites(long userId) {
        List<Movies> favor = new ArrayList<Movies>();
        Favorites favorites = userFavorite.get(userId);
        if (favorites == null || favorites.getFavList().isEmpty()) {
            throw new FavoriteEmptyException();
        } else {
            favor = favorites.getFavList();
        }
        return favor;
    }

    @Override
    public void addFavoritesById(long userId, long movieId) {
        MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
        Movies movies = movieDao.getMovieById(movieId);
        if (userFavorite.containsKey(userId)) {
            userFavorite.get(userId).getFavList().add(movies);
        } else {
            Favorites favorite = new Favorites();
            ArrayList<Movies> movieList = new ArrayList<Movies>();
            movieList.add(movies);
            favorite.setFavList(movieList);
            userFavorite.put(userId, favorite);
        }
    }

    @Override
    public void removeFavoritesById(long userId, long movieId) {
        List<Movies> movieList = userFavorite.get(userId).getFavList();
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getMovieId() == movieId) {
                movieList.remove(i);
                break;
            }
        }
    }
}
