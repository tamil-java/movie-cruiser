package com.cognizant.movie.dao;

import com.cognizant.movie.model.Movies;

public class MovieDaoCollectionImplTest {
    public static void main(String[] args) {
        System.out.println("MovieDaoCollectionImplTest");
        testGetMenuItemListAdmin();
        testEditMenuItem();
        testGetMenuItemListCustomer();
        testGetMenuItem();
        testGetMenuItemListAdmin();
    }

    public static void testEditMenuItem() {
        System.out.println("\nEditMovies() Called ");
        Movies movies = new Movies(1, "Hobs and Shaw", 23241341234L, true,
                com.cognizant.movie.util.DateUtil.convertToDate("15/03/2010"), "Action", true);
        System.out.println("Modified Movie to be added -->" + movies);
        MovieDao movieDao = new MovieDaoCollectionImpl();
        movieDao.editMovieList(movies);
        System.out.println("Modified Movie");
        for (Movies movie : movieDao.getMovieListAdmin()) {
            System.out.println(movie);
        }
        System.out.println("New Movie->" + movieDao.getMovieById((movies.getMovieId())));
    }

    public static void testGetMenuItemListAdmin() {
        System.out.println("\nGetMovieListAdmin() Called");
        MovieDao movieDao = new MovieDaoCollectionImpl();
        for (Movies movies : movieDao.getMovieListAdmin()) {
            System.out.println(movies);
        }
    }

    public static void testGetMenuItemListCustomer() {
        System.out.println("\nGetMovieListCustomer() Called");
        MovieDao menuItemDao = new MovieDaoCollectionImpl();
        for (Movies movies : menuItemDao.getMovieListCustomer()) {
            System.out.println(movies);
        }
    }

    public static void testGetMenuItem() {
        System.out.println("\nGetMovie() Called");
        MovieDao movieDao = new MovieDaoCollectionImpl();
        System.out.println(movieDao.getMovieById(1));
    }
}
