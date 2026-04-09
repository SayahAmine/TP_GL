

import enums.Speciality;
import enums.Status;
import model.Person;
import model.Technician;
import model.WorkshopManager;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Amine", "B.", "amine@example.com", "amineLogin", "aminePass");
        System.out.println("Testing Person:");
        p1.display();

        System.out.println("Auth1 (correct): " + p1.authentication1("amineLogin", "aminePass"));
        System.out.println("Auth1 (wrong): " + p1.authentication1("amineLogin", "wrongPass"));
        System.out.println("Auth2 (correct): " + p1.authentication2("amineLogin", "aminePass"));
        System.out.println("Auth2 (wrong): " + p1.authentication2("amineLogin", "wrongPass"));


        Technician tech = new Technician("Sara", "K.", "sara@example.com", "saraLogin", "saraPass",
                12345, Speciality.IT);
        System.out.println("\nTesting Technician:");
        tech.display();


        WorkshopManager wm = WorkshopManager.getInstance("Ali", "M.", "ali@example.com", "aliLogin", "aliPass",
                5, new Date(120, 1, 1), new Date(125, 1, 1), Status.Active);
        System.out.println("\nTesting WorkshopManager:");
        wm.display();

        int updatedExp = wm.updatig_Experiance_Date(new Date());
        System.out.println("Updated Experience: " + updatedExp);
    }
}
