package pl.edu.wszib.car.rent.model;

public class Car extends Vehicle {
    public Car(String brand, String model, String plate) {
        super(brand, model, plate);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "}";
    }
}
