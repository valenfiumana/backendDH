package mesas;

public class ProxyMovie implements IMovie{
    private Integer views;
    private RealMovie linkMovie;

    public ProxyMovie(Integer views) {
        this.views = views;
        this.linkMovie=new RealMovie();
    }

    @Override
    public String getMovie(String movieName) throws MovieException {
        if(views<=4){
            views++;
            return linkMovie.getMovie(movieName);
        }
        else{
            throw new MovieException(
                    "You can't watch "+movieName+" as you've already seen 5 movies this week. Sorry bro, next time");
        }
    }
}
