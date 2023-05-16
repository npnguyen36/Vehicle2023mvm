import javax.swing.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("In Vehicles Main");
        System.out.println("Second Line");
        String nickname = JOptionPane.showInputDialog("What is the nickname of this vehicle?");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonsOfGas(10.0);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setGallonsOfGas(8.0);
        yourVehicle.setOdometer(10000);
        allVehicles.add(yourVehicle);

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setMilesPerGallon(15);
        ourVehicle.setGallonsOfGas(12.0);
        ourVehicle.setOdometer(20000);
        allVehicles.add(ourVehicle);

        drive(100);
        drive(60);

    }
    private static void drive(int milesDriven){
        for(Vehicle vehicle: allVehicles){
            System.out.println(" Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
            vehicle.go(milesDriven);
            System.out.println(" Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
        }
    }
}