import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

                Author Havel = new Author("Václav", "Havel");
                Book Pivo = new Book("Pivo", Genre.SCIFI, 255, Havel);

                Author Henry = new Author("Vladimír", "Henry");
                Book Ruka = new Book("Ruka", Genre.CRIME, 555, Henry);
                Book Statistika = new Book ("Statistika", Genre.HORROR, 15, Henry);

                Author Čapek = new Author("Karel", "Čapek");
                Book RUR = new Book("RUR", Genre.FANTASY, 368, Čapek);

                Author Němec = new Author("Karel", "Němec");
                Book Velryba = new Book("Velryba", Genre.COMICS, 55, Němec);

                Author Rybová = new Author ("Vlasta", "Rybová");
                Book Květiny = new Book ("Květiny", Genre.HORROR, 875, Rybová);
                Book Matika = new Book("Matika", Genre.HORROR, 13, Rybová);

                //přidat knihu do knihkupectví
        Bookstore bookstore = new Bookstore();
        bookstore.addBook(Pivo);
        bookstore.addBook(Ruka);
        bookstore.addBook(Statistika);
        bookstore.addBook(Velryba);
        bookstore.addBook(Matika);
        bookstore.addBook(RUR);
        bookstore.addBook(Květiny);

        //vypsaní všech knih v knihkupectví
        System.out.println("Vypsaní knih v knihkupectví: ");
        bookstore.printAllBooks();
        System.out.println();

        //Kniha podle názvu
        System.out.println("Kniha podle názvu");
        System.out.println(bookstore.getBookByName("RUR"));

        //Cena průměrná knih v knihkupectví
        System.out.println("Průměrná cena");
        System.out.println(bookstore.getAveragePrice());

        //Knihy podle žánru
        System.out.println("Knihy podle žánru: ");
        Book[] booksByGenre = bookstore.getBooksByGenre(Genre.SCIFI);
        for (Book book : booksByGenre) {
            System.out.println(book);
        }

        //Knihy pod určitou cenu
        System.out.println("Knihy pod určenou cenou: ");
        Book[] booksUnderPrice = bookstore.getBooksUnderPrice(55);
        for (Book book : booksUnderPrice) {
            System.out.println(book);
        }

        //Knihy podle příjmení autora
        System.out.println("Knihy podle příjmení autora");
        Book[] booksByAuthorSurname = bookstore.getBooksByAuthorSurname("Rybová");
        for (Book book : booksByAuthorSurname) {
            System.out.println(book);
        }

        //Knihy podle array listu přijmení
        System.out.println("Podle Arraylist příjmení" );
        ArrayList<Book> authorBooks2 = bookstore.getBooksBySurnameArray("Henry");
        for (Book book : authorBooks2) {
            System.out.println(book);
        }
    }
    }
