import java.util.Scanner;

class Books {
    Scanner in = new Scanner(System.in);
    String name, author;
    int price, numPages;
    int n; // Declare n as an instance variable
    Books[] b; // Declare b as an array of Books

    // Parameterless constructor
    Books() {
    }

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String bookDetails;
        bookDetails = "Book name: " + this.name + "\n";
        bookDetails += "Author name: " + this.author + "\n";
        bookDetails += "Book price: " + this.price + "\n";
        bookDetails += "Number of pages: " + this.numPages + "\n";
        return bookDetails;
    }

    public void get() {
        System.out.println("Enter number of books:");
        n = in.nextInt();
        b = new Books[n]; // Initialize the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of book " + (i + 1) + ":");
            name = in.next();
            System.out.println("Enter the name of Author " + (i + 1) + ":");
            author = in.next();
            System.out.println("Enter the price of book " + (i + 1) + ":");
            price = in.nextInt();
            System.out.println("Enter the number of pages of book " + (i + 1) + ":");
            numPages = in.nextInt();
            b[i] = new Books(name, author, price, numPages);
        }
    }

    public void put() {
        for (int i = 0; i < n; i++) {
            System.out.println("The details of book " + (i + 1) + ":\n" + b[i].toString());
        }
    }
}

class Main {
    public static void main(String args[]) {
        Books o = new Books();
        o.get();
        o.put();
    }
}