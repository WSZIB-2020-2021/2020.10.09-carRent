package pl.edu.wszib.car.rent.gui;

import pl.edu.wszib.car.rent.database.VehiclesDataBase;
import pl.edu.wszib.car.rent.model.Bus;
import pl.edu.wszib.car.rent.model.Car;
import pl.edu.wszib.car.rent.model.Vehicle;

import java.util.List;
import java.util.Scanner;

public class GUI {
    public void showMainMenu() {
        System.out.println("1. Show cars");
        System.out.println("2. Show buses");
        System.out.println("3. Show all vehicles");
        System.out.println("4. Rent vehicle");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        VehiclesDataBase vehiclesDataBase = new VehiclesDataBase();

        switch (choose) {
            case "1":
                List<Car> cars = vehiclesDataBase.getCars();
                for (Car currentCar : cars) {
                    System.out.println(currentCar);
                }
                showMainMenu();
                break;
            case "2":
                List<Bus> buses = vehiclesDataBase.getBuses();
                for (Bus bus : buses) {
                    System.out.println(bus);
                }
                showMainMenu();
                break;
            case "3":
                List<Vehicle> vehicles = vehiclesDataBase.getAllVehicles();
                for(Vehicle currentVehicle : vehicles) {
                    System.out.println(currentVehicle);
                }
                showMainMenu();
                break;
            case "4":
                System.out.println("Type plate:");
                String plate = scanner.nextLine();
                boolean success = vehiclesDataBase.rentVehicle(plate);
                if(success) {
                    System.out.println("Car is your !!");
                } else {
                    System.out.println("Bad plate or car is rent !!");
                }
                showMainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Incorrect choose !");
                showMainMenu();
                break;
        }
    }
}
