package pl.edu.wszib.car.rent.database;

import pl.edu.wszib.car.rent.model.Bus;
import pl.edu.wszib.car.rent.model.Car;
import pl.edu.wszib.car.rent.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehiclesDataBase {
    private List<Vehicle> vehicles = new ArrayList<>();

    public VehiclesDataBase() {
        this.vehicles.add(new Car("BMW", "5", "KR234"));
        this.vehicles.add(new Car("Toyota", "Supra", "KR8766"));
        this.vehicles.add(new Bus("Volvo", "K1000", "WAW123", 50, 6));
        this.vehicles.add(new Bus("MAN", "C100", "PO555", 40, 4));
    }

    public List<Vehicle> getAllVehicles() {
        return this.vehicles;
    }

    public List<Car> getCars() {
        List<Car> result = new ArrayList<>();
        for(Vehicle currentVehicle : this.vehicles) {
            if(currentVehicle instanceof Car) {
                result.add((Car) currentVehicle);
            }
        }
        return result;
    }

    public List<Bus> getBuses() {
        List<Bus> result = new ArrayList<>();
        for (Vehicle vehicle : this.vehicles) {
            if(vehicle instanceof Bus) {
                result.add((Bus) vehicle);
            }
        }
        return result;
    }

    public boolean rentVehicle(String plate) {
        for (Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate) && !vehicle.isRent()) {
                vehicle.setRent(true);
                return true;
            }
        }
        return false;
    }
}
