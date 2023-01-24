public class Books {
    private String title;
    private String author;

    private int price;
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    private void printInfoBook(){
        System.out.println("Book Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\n Price: " + getPrice() );
    }


    }

