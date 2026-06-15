package edu.tstc.autoshop.model;

/**
 * One visit to the shop: a customer brings a vehicle in for work.
 *
 * The big idea here is HAS-A (composition): a RepairOrder HAS a
 * Customer and HAS a Vehicle. Instead of copying the customer's
 * name or the car's model into here, we simply hold on to the
 * whole Customer object and the whole Vehicle object.
 */
public class RepairOrder {

    // These two fields are OTHER objects, not just text.
    private Customer customer;
    private Vehicle vehicle;
    // A simple word for where the order stands: "Open", "In Progress", "Done".
    private String status;

    // Constructor: a repair order needs a customer, a vehicle, and a status.
    public RepairOrder(Customer customer, Vehicle vehicle, String status) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.status = status;
    }

    // --- Getters and setters ---

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Describes the whole order in one line by reusing the display
    // methods from Customer and Vehicle. For example:
    // "Maria Lopez (555-1234) - Toyota Corolla [ABC-123] - Open"
    public String getSummary() {
        return customer.getDisplayName()
                + " - " + vehicle.getDisplayName()
                + " - " + status;
    }
}
