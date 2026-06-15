package edu.tstc.autoshop.model;

/**
 * A car that belongs to a customer.
 *
 * For now we keep three pieces of information: the make (brand),
 * the model, and the license plate.
 */
public class Vehicle {

    // Private fields: only this class touches them directly.
    private String make;
    private String model;
    private String licensePlate;

    // Constructor: sets all three fields when we create a Vehicle.
    public Vehicle(String make, String model, String licensePlate) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    // --- Getters and setters ---

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Returns a friendly one-line description,
    // for example: "Toyota Corolla [ABC-123]".
    public String getDisplayName() {
        return make + " " + model + " [" + licensePlate + "]";
    }
}
