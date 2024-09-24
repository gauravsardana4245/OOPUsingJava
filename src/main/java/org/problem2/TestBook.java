package org.problem2;
import org.problem1.Author;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Gaurav Sardana", "gaurravsarrdana@gmail.com", 'm');
        authors[1] = new Author("Vahe Aslanyan", "vaheaslayan@somewhere.com", 'm');

        Book javaOops = new Book("Advanced Object-Oriented Programming in Java", authors, 29.99, 99);

        System.out.println(javaOops);

        javaOops.setPrice(35.95);
        javaOops.setQty(45);

        System.out.println("Book name is: " + javaOops.getName());
        System.out.println("Book price is: " + javaOops.getPrice());
        System.out.println("Book quantity is: " + javaOops.getQty());

        System.out.println("Author names: " + javaOops.getAuthorNames());

        for (Author author : javaOops.getAuthors()) {
            System.out.println("Author name: " + author.getName());
            System.out.println("Author email: " + author.getEmail());
            System.out.println("Author gender: " + author.getGender());
        }

        Author[] moreAuthors = new Author[3];
        moreAuthors[0] = new Author("John Smith", "john@somewhere.com", 'm');
        moreAuthors[1] = new Author("Jane Doe", "jane@nowhere.com", 'f');
        moreAuthors[2] = new Author("Alice Lee", "alice@where.com", 'f');

        Book advancedJava = new Book("Advanced Java Programming", moreAuthors, 39.99);
        System.out.println(advancedJava);
    }
}

