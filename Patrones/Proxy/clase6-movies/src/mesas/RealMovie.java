package mesas;

public class RealMovie implements IMovie{

    @Override
    public String getMovie(String movieName) {
        return "www."+movieName+".com";
    }
}
