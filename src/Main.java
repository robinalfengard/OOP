public class Main {
    public static void main(String[] args) {
        Books[] book = new Books[2];
        Books book1 = new Books();
        Books book2 = new Books();
        book1.title = "Harry Potter";
        book1.author = "JK Rowling";
        book1.price = 150;
        book2.title = "IT";
        book2.author = "Stephen King";
        book2.price = 100;
        printInfoBook(book1);

        Movies movie1 = new Movies();
        movie1.title = "James Bond";
        movie1.genre = MovieGenres.ACTION;
        movie1.price = 150;
        printInfoMovie(movie1);

    }

    static void printInfoBook(Books book){
        System.out.println("Book Title: " + book.title + "\nAuthor: " + book.author + "\n Price: " + book.price );
    }
    static void printInfoMovie(Movies movie){
        System.out.printf("Movie Title: %s \nAuthor: %s  \n Price: %d", movie.title, movie.genre, movie.price);
    }
}