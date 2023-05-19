import javax.swing.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("In Vehicles Main");
        promptUser();
        displayOutput();
    }

    public static void promptUser() {


        System.out.println("Second Line");

        int goAgain = JOptionPane.NO_OPTION;
        do {
            String nickName = JOptionPane.showInputDialog("Enter the vehicle name:");

            String strMilesPerGallon = JOptionPane.showInputDialog("Enter Mile per Gallon:");
            int milesPerGallon = Integer.parseInt(strMilesPerGallon);

            Vehicle vehicle = new Vehicle();
            vehicle.setMilesPerGallon(milesPerGallon);
            String strGallonOfGas = JOptionPane.showInputDialog("Enter Gallon of Gas:");
            double gallonOfGas = Integer.parseInt(strGallonOfGas);
            vehicle.setGallonsOfGas(gallonOfGas);
            String StrOdometer = JOptionPane.showInputDialog("Enter Odometer:");
            int odemeter = Integer.parseInt(StrOdometer);
            vehicle.setOdometer(odemeter);
            allVehicles.add(vehicle);
            goAgain = JOptionPane.showConfirmDialog(null, "Do you want to enter another vehicle?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (goAgain == JOptionPane.YES_OPTION);

    }

    
    private static void displayOutput() {
        do {
            String stringMilesDriven = JOptionPane.showInputDialog("Enter Miles Driven");
            int milesDriven = Integer.parseInt(stringMilesDriven);
            for (Vehicle vehicle : allVehicles) {
                System.out.println(" Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
                vehicle.go(milesDriven);
                System.out.println(" Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonsOfGas());
            }
}while(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you want another trips?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }
}