package edu.tstc.autoshop.model;

/**
 * A customer of the auto shop — the person who owns a car.
 *
 * For now we keep just two pieces of information: the customer's
 * name and phone number. We'll add more later as the app grows.
 */
public class Customer {

    // Private fields: only this class can touch them directly.
    // Other classes read or change them through the methods below.
    private String name;
    private String phone;

    // Constructor: runs when we create a new Customer and sets both fields.
    // "this.name" means the field; "name" means the value passed in.
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // --- Getters and setters: read and change the private fields ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Returns the name with the phone in parentheses,
    // for example: "Maria Lopez (555-1234)".
    public String getDisplayName() {
        return name + " (" + phone + ")";
    }
}
