package edu.tstc.autoshop.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.tstc.autoshop.model.Customer;

/**
 * Hands the list of customers to the web page as JSON.
 *
 * @RestController tells Spring: when a browser asks for the URL below,
 * run this method and send back the returned data as JSON (not a page).
 *
 * For now we build the list right here with a few sample customers,
 * because we don't have a database yet. Later, only this method will
 * change — the web page that shows the list stays the same.
 */
@RestController
public class CustomerController {

    // When someone visits http://localhost:8080/api/customers,
    // Spring runs this method and turns the returned list into JSON.
    @GetMapping("/api/customers")
    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Maria Lopez", "555-1234"));
        customers.add(new Customer("John Smith", "555-5678"));
        customers.add(new Customer("Ana Garcia", "555-9012"));
        return customers;
    }
}
