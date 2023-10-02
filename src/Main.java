public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Smith", 35);
        Book book = new Book("The Great Gatsby", "Fiction", author);

        System.out.println(book.toString());
    }
}