package classandobject;

public class Movie {
    private static String distributor="Red Giant";
    private String movieName;
    private String directorName;
    private long movieBudgt;
    private int movieRelease;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public long getMovieBudgt() {
        return movieBudgt;
    }

    public void setMovieBudgt(long movieBudgt) {
        this.movieBudgt = movieBudgt;
    }

    public int getMovieRelease() {
        return movieRelease;
    }

    public void setMovieRelease(int movieRelease) {
        this.movieRelease = movieRelease;
    }
}
