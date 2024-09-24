package org.problem3;

public class TestMain {
    public static void main(String[] args) {
        Customer cl = new Customer(155, "David Wilson", 10);
        System.out.println(cl);
        cl.setDiscount(8);
        System.out.println(cl);

        System.out.println("id is: " + cl.getId());
        System.out.println("name is: " + cl.getName());
        System.out.println("discount is: " + cl.getDiscount());

        Invoice inv1 = new Invoice(202, cl, 999.9);
        System.out.println(inv1);
        inv1.setAmount(1099.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}

