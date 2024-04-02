package abstractclass;


abstract public class MovieDemo {

    private String title;
    private String director;
    private String releaseDate;
    private String duration;
    private String language;

    public MovieDemo(String title, String director, String releaseDate, String duration, String language) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public String getLanguage() {
        return language;
    }

    public abstract void getMovieDetails();
}

class RomComMovie extends MovieDemo {
    private String leadHero;
    private String leadHeroine;

    public RomComMovie(String title, String director, String releaseDate, String duration, String language, String leadHero, String leadHeroine) {
        super(title, director, releaseDate, duration, language);
        this.leadHero = leadHero;
        this.leadHeroine = leadHeroine;
    }

    @Override
    public void getMovieDetails() {
        System.out.println("Title=" + getTitle() + ",Director=" + getDirector() + ",Release Date=" + getReleaseDate() + ",Duration=" + getDuration() + ",Language=" + getLanguage() + ",Lead Hero=" + leadHero + ",Lead Heroine" + leadHeroine);
    }
}

class ThrillerMovie extends MovieDemo {
    private String mainCharacter;

    public ThrillerMovie(String title, String director, String releaseDate, String duration, String language, String mainCharacter) {
        super(title, director, releaseDate, duration, language);
        this.mainCharacter = mainCharacter;
    }

    @Override
    public void getMovieDetails() {
        System.out.println("Title=" + getTitle() + ",Director=" + getDirector() + ",Release Date=" + getReleaseDate() + ",Duration=" + getDuration() + ",Language=" + getLanguage() + ",Main character=" + mainCharacter);
    }
}

class MovieDriver {
    public static void main(String[] args) {
        MovieDemo movie1 = new RomComMovie("Oh My Kadaule", "Ashwath marimuthu", "14/02/20", "2:25", "Tamil", "Ashok selvan", "Ritika Singh");
        MovieDemo movie2 = new ThrillerMovie("Kanjana", "Raghava lawrence", "15/07/2011", "2:45", "Tamil", "Ragava Lawrence");
        movie1.getMovieDetails();
        movie2.getMovieDetails();
    }
}