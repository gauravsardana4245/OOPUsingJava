package org.problem1;

public class TestBook {
    public static void main(String[] args) {
        Author gSardana = new Author("Gaurav Sardana", "gaurravsarrdana@gmail.com", 'm');

        Book javaOops = new Book("OOP using Java", gSardana, 29.96, 99);

        System.out.println(javaOops);

        System.out.println("Book name is: " + javaOops.getName());
        System.out.println("Price is: " + javaOops.getPrice());
        System.out.println("Quantity is: " + javaOops.getQty());

        System.out.println("Author is: " + javaOops.getAuthor());
        System.out.println("Author's name is: " + javaOops.getAuthorName());
        System.out.println("Author's email is: " + javaOops.getAuthorEmail());
        System.out.println("Author's gender is: " + javaOops.getAuthorGender());

        javaOops.setPrice(35.25);
        javaOops.setQty(50);
        System.out.println("Updated price is: " + javaOops.getPrice());
        System.out.println("Updated quantity is: " + javaOops.getQty());

        Book anotherBook = new Book("Advanced Object-Oriented Programming in Java", new Author("Vahe Aslanyan", "vahe@somewhere.com", 'm'), 49.95);
        System.out.println(anotherBook);
    }
}
