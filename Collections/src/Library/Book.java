package Library;

public class Book implements Comparable<Book> {
    String bookname;
    String author;
    long isbn;
    double price;

    public Book(String bookname, String author, long isbn, double price) {
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public Book() {
        this.bookname = " ";
        this.author = "";
        this.isbn = 0;
        this.price = 10;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if (this.getPrice() < o.getPrice()) {
            return -1;
        } else if (this.getPrice() > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
