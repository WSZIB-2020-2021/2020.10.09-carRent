package pl.edu.wszib.car.rent.model;

public class Bus extends Vehicle {
    private int seats;
    private int wheels;

    public Bus(String brand, String model, String plate, int seats, int wheels) {
        super(brand, model, plate);
        this.seats = seats;
        this.wheels = wheels;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() + ", " +
                "seats=" + seats +
                ", wheels=" + wheels +
                '}';
    }
}
