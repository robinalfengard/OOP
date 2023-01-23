public class Main {
    public static void main(String[] args) {
        Books[] bookShelf = new Books[2];
        Movies[] moovieShelf = new Movies[2];
        Books book1 = new Books();
        Books book2 = new Books();
        bookShelf[0] = book1;
        bookShelf[1] = book2;
        book1.title = "Harry Potter";
        book1.author = "JK Rowling";
        book1.price = 150;
        book2.title = "IT";
        book2.author = "Stephen King";
        book2.price = 100;


        Movies movie1 = new Movies();
        Movies movie2 = new Movies();
        movie1.title = "James Bond";
        movie1.genre = MovieGenres.ACTION;
        movie1.price = 150;
        movie2.title = "American Psycho";
        movie2.genre = MovieGenres.ACTION;
        movie2.price = 150;
        moovieShelf[0] = movie1;
        moovieShelf[1] = movie2;



        for (Books book : bookShelf){
            printInfoBook(book);
        }
        for (int i = 0; i<moovieShelf.length; i++){
            printInfoMovie(moovieShelf[i]);
        }
    }

    private static void printInfoBook(Books book){
        System.out.println("Book Title: " + book.title + "\nAuthor: " + book.author + "\n Price: " + book.price );
    }
    static void printInfoMovie(Movies movie){
        System.out.printf("Movie Title: %s \nAuthor: %s  \n Price: %d", movie.title, movie.genre, movie.price);
    }
}