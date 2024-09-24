package org.problem1;

public class TestAuthor {
    public static void main(String[] args) {
        Author gSardana = new Author("Gaurav Sardana", "gaurravsarrdana@gmail.com", 'm');

        System.out.println(gSardana);

        System.out.println("Name is: " + gSardana.getName());
        System.out.println("Email is: " + gSardana.getEmail());
        System.out.println("Gender is: " + gSardana.getGender());

        gSardana.setEmail("gauravsardana@gmail.com");
        System.out.println("Updated email is: " + gSardana.getEmail());
    }
}

