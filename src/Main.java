

import enums.Speciality;
import model.Technician;
import model.Vehicle;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Technician tech = new Technician("Ali", "Ben", "ali@example.com", "aliLogin", "aliPass", 101, Speciality.IT);


        Calendar cal = Calendar.getInstance();
        cal.set(2009, Calendar.JUNE, 15);
        Date acquisitionDate1 = cal.getTime();

        Vehicle v1 = new Vehicle(acquisitionDate1, 15000, 123, "Peugeot", tech);
        tech.addVehicle(v1);

        System.out.println("=== Vehicle 1 ===");
        System.out.println("Model: " + v1.getModel());
        System.out.println("Acquisition Date: " + v1.getAcquisitionDate());
        System.out.println("Driver: " + v1.getDriver().getName());
        System.out.println("Needs reform? " + v1.reformCourant());

        cal.set(2015, Calendar.JANUARY, 1);
        Date acquisitionDate2 = cal.getTime();

        Vehicle v2 = new Vehicle(acquisitionDate2, 20000, 456, "BMW", tech);

        System.out.println("\n=== Vehicle 2 ===");
        System.out.println("Model: " + v2.getModel());
        System.out.println("Acquisition Date: " + v2.getAcquisitionDate());
        System.out.println("Driver: " + (v2.getDriver() != null ? v2.getDriver().getName() : "None"));
        System.out.println("Needs reform? " + v2.reformCourant());
    }
}
