public class Book {
    private String name;
    private Genre genre;
    private double price;
    private Author author;

    public Book(String name, Genre genre, double price, Author author) {
        setName(name);
        setGenre(genre);
        setPrice(price);
        setAuthor(author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Kniha" +
                " název: " + name +
                ", žánr: " + genre +
                ", cena: " + price +
                ", autor: " + author;
    }
}

