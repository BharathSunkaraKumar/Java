class Books {
    int pages;
    String title;

    Books(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    void getBooks() {
        System.out.println(this.title + " (" + this.pages + "pages)");
    }
}

class Library {
    String name;
    int year;
    Books[] books;

    Library(String name, int year, Books[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    // Tirupati Central Library
    void showLibrary() {
        System.out.println(this.name + " establised in year of " + this.year);

        System.out.println("Books avilable: ");
        // System.out.println(books[0]);
        for (Books book : books) {
            book.getBooks();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books(320, "Atomic habits");
        Books book2 = new Books(304, "Digital minimalism");
        Books book3 = new Books(288, "Courage to be disliked");

        Books[] books = { book1, book2, book3 };

        Library library = new Library("Sri Venkateswara University Library", 1995, books);
        library.showLibrary();
        // book1.getBooks();
        // book2.getBooks();
        // book3.getBooks();
    }
}
