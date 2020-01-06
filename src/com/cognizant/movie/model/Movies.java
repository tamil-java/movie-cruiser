package com.cognizant.movie.model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movies {

    private long movieId;
    private String title;
    private long boxOffice;
    private boolean active;
    private Date dateOfLaunch;
    private String genre;
    private boolean hasTeaser;

    public Movies() {
        super();

    }

    public Movies(long movieId, String title, long boxOffice, boolean active, Date dateOfLaunch,
            String genre, boolean hasTeaser) {
        super();
        this.movieId = movieId;
        this.title = title;
        this.boxOffice = boxOffice;
        this.active = active;
        this.dateOfLaunch = dateOfLaunch;
        this.genre = genre;
        this.hasTeaser = hasTeaser;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieid(long movieId) {
        this.movieId = movieId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(long boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Date getDateOfLaunch() {
        return dateOfLaunch;
    }

    public void setDateOfLaunch(Date dateOfLaunch) {
        this.dateOfLaunch = dateOfLaunch;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isHasTeaser() {
        return hasTeaser;
    }

    public void setHasTeaser(boolean hasTeaser) {
        this.hasTeaser = hasTeaser;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (movieId ^ (movieId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movies other = (Movies) obj;
        if (movieId != other.movieId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        DecimalFormat decimalformat = new DecimalFormat("$0,000,000,000");
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%-6s%-23s%-20s%-10s%-15s%-23s%-18s", getMovieId(), getTitle(),
                decimalformat.format(getBoxOffice()), (isActive() == false) ? "No" : "Yes",
                dateformat.format(getDateOfLaunch()), getGenre(),
                (isHasTeaser() == false) ? "No" : "Yes");
    }

}
