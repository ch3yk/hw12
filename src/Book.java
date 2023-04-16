public class Book {
    private String bookName;
    private Author authorName;
    private int year;

    public Book(String bookName, Author authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;

    }

    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return authorName ;
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return getBookName()+" "+authorName+" "+getYear();
    }
}
