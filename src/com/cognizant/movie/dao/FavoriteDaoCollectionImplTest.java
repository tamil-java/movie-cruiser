package com.cognizant.movie.dao;

import java.util.List;

import com.cognizant.movie.model.Movies;

public class FavoriteDaoCollectionImplTest {
    public static void main(String[] args) {
        testAddFavorites();
        testGetAllFavorites();
        testRemoveFavorites();
        testGetAllFavorites();
    }

    public static void testAddFavorites() {
        System.out.println("AddFavorites() Called");
        FavoriteDao favoriteDao = new FavoriteDaoCollectionImpl();
        favoriteDao.addFavoritesById(1, 1);
        favoriteDao.addFavoritesById(1, 2);
        favoriteDao.addFavoritesById(1, 3);
    }

    public static void testRemoveFavorites() {
        System.out.println("RemoveFavorite() Called");
        FavoriteDao favoriteDao = new FavoriteDaoCollectionImpl();
        favoriteDao.removeFavoritesById(1, 1);
    }

    public static void testGetAllFavorites() {
        System.out.println("GetAllFavorites() Called");
        FavoriteDao favDao = new FavoriteDaoCollectionImpl();
        List<Movies> movies = favDao.getAllFavorites(1);
        for (Movies movie : movies) {
            System.out.println(movie);
        }
    }

}
