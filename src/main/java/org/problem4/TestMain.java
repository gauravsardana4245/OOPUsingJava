package org.problem4;

public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 15000);
        System.out.println(student);
        student.setFee(16000);
        System.out.println("Updated fee: " + student.getFee());

        Staff staff = new Staff("Jane Smith", "456 Oak St", "ABC High School", 55000);
        System.out.println(staff);
        staff.setSchool("XYZ College");
        System.out.println("Updated school: " + staff.getSchool());
    }
}
