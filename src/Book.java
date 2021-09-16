public class Book {
    String name;
    String author;
    int publishing_date;

    Book (String n) {
        name = n;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String a) {
        this.author = a;
    }

    void setPublishing_date(int d) {
        this.publishing_date = d;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getPublishing_date() {
        return publishing_date;
    }
}
