import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> books;

    public Bookstore(){
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void printAllBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }
    public Book getBookByName(String name){
        for (Book book : books){
            if (book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }

    public double getAveragePrice(){
        double sum = 0;
        for (Book book : books){
            sum += book.getPrice();
        }
        return sum/books.size();
    }

    public Book[] getBooksByGenre(Genre genre){
        ArrayList<Book> booksByGenre = new ArrayList<>();
        for (Book book : books){
            if (book.getGenre().equals(genre)){
                booksByGenre.add(book);
            }
        }
        return booksByGenre.toArray(new Book[0]);
    }

    public Book[] getBooksUnderPrice(double price){
        ArrayList<Book> booksUnderPrice = new ArrayList<>();
        for (Book book : books){
            if (book.getPrice()<price){
                booksUnderPrice.add(book);
            }
        }
        return booksUnderPrice.toArray(new Book[0]);
    }


    public Book[] getBooksByAuthorSurname (String surname){
        ArrayList<Book> booksByAuthorSurname = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().getSurname().equals(surname)){
                booksByAuthorSurname.add(book);
            }
        }
        return booksByAuthorSurname.toArray(new Book[0]);
    }

//kdyby se nemělo vracet pole knih ale array list podle surname
    public ArrayList<Book> getBooksBySurnameArray(String surname){
        ArrayList<Book> booksByAuthorSurname = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().getSurname().equals(surname)){
                booksByAuthorSurname.add(book);
            }
        }
        return booksByAuthorSurname;
    }
}
