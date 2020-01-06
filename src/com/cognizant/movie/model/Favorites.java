package com.cognizant.movie.model;

import java.util.List;

public class Favorites {
    private List<Movies> favoriteList;
    private int total;

    public List<Movies> getFavList() {
        return favoriteList;
    }

    public void setFavList(List<Movies> movieList) {
        this.favoriteList = movieList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
