public class Main {
    public static void main(String[] args) {
        Author authorWarAndPeace = new Author("Л.Н.Толстой");
        Book warAndPeace = new Book("Война и мир", authorWarAndPeace, 1867);
        Author authorOffenceAndPunishment = new Author("Ф.М.Достоевский");
        Book OffenceAndPunishment = new Book("Преступление и наказание",authorOffenceAndPunishment,1866);
        System.out.println(warAndPeace.getAuthor() + " " + warAndPeace.getBookName() + " " + warAndPeace.getYear());
        System.out.println(OffenceAndPunishment.getAuthor() + " " + OffenceAndPunishment.getBookName() + " " + OffenceAndPunishment.getYear());
        OffenceAndPunishment.setYear(2002);
        System.out.println(OffenceAndPunishment.getAuthor() + " " + OffenceAndPunishment.getBookName() + " " + OffenceAndPunishment.getYear());

    }
    }
