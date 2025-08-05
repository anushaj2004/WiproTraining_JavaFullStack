package assessment;
import java.util.ArrayList;

class Vehicle {
    private String type;
    private boolean rented;

    public Vehicle(String type) {
        this.type = type;
        this.rented = false;
    }

    public String getType() {
        return type;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "type='" + type + '\'' + ", rented=" + rented + '}';
    }
}

class VehicleRentalSystem {
    private ArrayList<Vehicle> vehicles;

    public VehicleRentalSystem() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(String type) {
        for (Vehicle v : vehicles) {
            if (v.getType().equalsIgnoreCase(type) && !v.isRented()) {
                v.setRented(true); // Important: update object state, don't reassign!
                System.out.println("Rented: " + v);
                return;
            }
        }
        System.out.println("No available " + type + " to rent.");
    }

    public void printVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();

        rentalSystem.addVehicle(new Vehicle("Car"));
        rentalSystem.addVehicle(new Vehicle("Bike"));
        rentalSystem.addVehicle(new Vehicle("Car"));
        rentalSystem.addVehicle(new Vehicle("Scooter"));
        rentalSystem.printVehicles(); 
        rentalSystem.rentVehicle("Car");     // Should rent the first available car
        rentalSystem.rentVehicle("Car");     // Should rent the second car
        rentalSystem.rentVehicle("Car");     // Should say "No available Car to rent."
        rentalSystem.rentVehicle("Bike");    // Should rent the bike

        System.out.println("\nAll Vehicles:");
        rentalSystem.printVehicles();        // View the rental status of all vehicles
    }
}
