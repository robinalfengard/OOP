public class Main {
    public static void main(String[] args) {
        Books[] bookShelf = new Books[2];
        Movies[] moovieShelf = new Movies[2];
        Books book1 = new Books();
        Books book2 = new Books();
        bookShelf[0] = book1;
        bookShelf[1] = book2;
        book1.setTitle( "Harry Potter");
        book1.setAuthor("JK Rowling");
        book1.setPrice(150);
        book2.setTitle("IT");
        book2.setAuthor("Stephen King");
        book2.setPrice( 100);


        Movies movie1 = new Movies();
        Movies movie2 = new Movies();
        movie1.setTitle("James Bond");
        movie1.setGenre(MovieGenres.ACTION);
        movie1.setPrice(150);
        movie2.setTitle("American Psycho");
        movie2.setGenre(MovieGenres.ACTION);
        movie2.setPrice(150);
        moovieShelf[0] = movie1;
        moovieShelf[1] = movie2;

        for (Books book : bookShelf) {
            printInfoBook(book);
        }


        for (int i = 0; i<moovieShelf.length; i++){
            printInfoMovie(moovieShelf[i]);
        }
    }

    private static void printInfoBook(Books book){
        System.out.println("Book Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\n Price: " + book.getPrice() );
    }
    static void printInfoMovie(Movies movie){
        System.out.printf("Movie Title: %s \nAuthor: %s  \n Price: %d", movie.getTitle(), movie.getGenre(), movie.getPrice());
    }
}