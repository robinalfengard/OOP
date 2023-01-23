import java.rmi.MarshalledObject;

public class Movies {
    String title;
    MovieGenres genre;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenres genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenres getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    int price;

}
