package com.cognizant.movie.dao;

public class FavoriteEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Favorite is Empty\n";
    }

}
