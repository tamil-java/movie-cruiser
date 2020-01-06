package com.cognizant.movie.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cognizant.movie.model.Movies;
import com.cognizant.movie.util.DateUtil;
public class MovieDaoCollectionImpl implements MovieDao {
    Movies movies[] = new Movies[5];
    public static List<Movies> movieList;

    public MovieDaoCollectionImpl() {
        if (movieList == null) {

            movies[0] = new Movies(1, "Avatar", 2787965087L, true,
                    DateUtil.convertToDate("15/03/2017"), "Science Fiction", true);
            movies[1] = new Movies(2, "The Avenges", 1518812988L, true,
                    DateUtil.convertToDate("23/12/2017"), "Super Hero", true);
            movies[2] = new Movies(3, "Titanic", 2187463944L, true,
                    DateUtil.convertToDate("21/08/2017"), "Romance", true);
            movies[3] = new Movies(4, "Jurrasic World", 1671713208L, false,
                    DateUtil.convertToDate("02/07/2017"), "Science Fiction", true);
            movies[4] = new Movies(5, "Avengers End game", 2750760348L, true,
                    DateUtil.convertToDate("02/11/2022"), "Super Hero", true);
            movieList = new ArrayList<Movies>();
            for (int i = 0; i < 5; i++) {
                movieList.add(movies[i]);
            }

        }
    }

    @Override
    public Movies getMovieById(long movieId) {
        for (Movies movie : movieList) {
            if (movie.getMovieId() == movieId) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public void editMovieList(Movies movies) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getMovieId() == movies.getMovieId()) {
                movieList.set(i, movies);
            }
        }
    }

    @Override
    public List<Movies> getMovieListAdmin() {
        return movieList;
    }

    @Override
    public List<Movies> getMovieListCustomer() {
        ArrayList<Movies> getMovies = new ArrayList<Movies>();
        for (Movies movie : movieList) {
            Date date = new Date();
            if (movie.isActive() == true && ((date.after(movie.getDateOfLaunch())
                    || date.equals(movie.getDateOfLaunch())))) {
                getMovies.add(movie);
            }

        }
        return getMovies;
    }

}
