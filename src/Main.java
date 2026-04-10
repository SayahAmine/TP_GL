
import enums.Speciality;
import enums.Status;
import enums.Type;
import model.*;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Amine", "B.", "amine@example.com", "amineLogin", "aminePass");
        System.out.println("=== Person ===");
        p1.display();
        System.out.println("Auth1 (correct): " + p1.authentication1("amineLogin", "aminePass"));
        System.out.println("Auth2 (wrong): " + p1.authentication2("amineLogin", "wrongPass"));

        Technician t1 = new Technician("Ali", "Ben", "ali@example.com", "aliLogin", "aliPass", 101, Speciality.IT);
        Technician t2 = new Technician("Sara", "K.", "sara@example.com", "saraLogin", "saraPass", 102, Speciality.Mechanic);

        Vehicle v1 = new Vehicle(555, "Toyota Hilux", null);
        t1.addVehicle(v1);

        System.out.println("\n=== Technician & Vehicle ===");
        t1.display();
        System.out.println("Vehicle driver: " + v1.getDriver().getName());

        System.out.println("\n=== Team Leader Designation ===");
        t1.designateTeamLeader(t2);
        t2.designateTeamLeader(t1);

        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.APRIL, 10);
        Date startDate = cal.getTime();
        cal.set(2026, Calendar.MAY, 10);
        Date endDate = cal.getTime();

        Workshop workshop = new Workshop(1, startDate, endDate);
        System.out.println("\n=== Workshop ===");
        System.out.println("Workshop number: " + workshop.getWorkshopNumber());
        System.out.println("Start date: " + workshop.getStartDate());
        System.out.println("End date: " + workshop.getEndDate());

        cal.set(2020, Calendar.JANUARY, 1);
        Date dateExp = cal.getTime();
        cal.set(2025, Calendar.JANUARY, 1);
        Date datePromo = cal.getTime();

        WorkshopManager wm = WorkshopManager.getInstance("Karim", "M.", "karim@example.com", "karimLogin", "karimPass",
                5, dateExp, datePromo, Status.Functional);

        System.out.println("\n=== WorkshopManager ===");
        wm.display();
        int updatedExp = wm.updatig_Experiance_Date(new Date());
        System.out.println("Updated Experience: " + updatedExp);

        WorkshopManager wm2 = WorkshopManager.getInstance("Other", "X", "other@example.com", "otherLogin", "otherPass",
                10, new Date(), new Date(), Status.Defective);
        wm2.display();
    }
}
