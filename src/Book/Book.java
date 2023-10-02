// Код класса Book
class Book {
    private String title;
    private String genre;
    private Author author;

    public Book(String title, String genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

// Геттеры и сеттеры

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, author);
    }
}

// Пример использования