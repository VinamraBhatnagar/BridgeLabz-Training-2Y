class Vehicle {
    static double registrationFee = 5000.0;

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println("----------------------------");
        } else {
            System.out.println("Not a valid Vehicle object.");
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP32AB1234", "Alice", "Car");
        Vehicle v2 = new Vehicle("UP32XY5678", "Bob", "Bike");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000);

        System.out.println("After updating fee:");
        v1.displayDetails();
        v2.displayDetails();
    }
}
