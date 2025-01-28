package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Athanasios", "Androutsos");
        User user = new User(1,true , "Mask", "cmask", "12345", "Costas");
        Customer customer = new Customer(1,"10434", "76", "Patision", "Athens", "Attica" , "West Athens", "6984353203","West Athens","Lincon","Andrew");
        Point point = new Point(0,10);
        Order order = new Order(1,"ordered", "Meat", 5.5);

        System.out.println("Teacher full name: " + teacher.getFirstname() + " , " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer Vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formatted Timestamp " + order.getFormattedTimestamp());
        System.out.printf("Point:{%d, %d}\n", point.getX(), point.getY() );
    }
}
