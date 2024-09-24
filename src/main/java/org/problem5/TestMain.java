package org.problem5;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(circle, 10.0);
        System.out.println(cylinder);

        System.out.printf("Volume of the cylinder: %.2f%n", cylinder.getVolume());
    }
}

