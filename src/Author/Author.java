import java.util.Objects;

// Код класса Author
class Author {
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

// Геттеры и сеттеры

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}