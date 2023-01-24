
public class Movies {
   private String title;
   private MovieGenres genre;
    private int  price;
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


    private void printInfoMovie(){
        System.out.printf("Movie Title: %s \nAuthor: %s  \n Price: %d", getTitle(), getGenre(), getPrice());
    }

}
