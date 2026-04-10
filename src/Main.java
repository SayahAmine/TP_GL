

import enums.Speciality;
import enums.Status;
import model.Person;
import model.Technician;
import model.WorkshopManager;

import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {



        Calendar cal = Calendar.getInstance();
        cal.set(2020, Calendar.JANUARY, 1);
        Date dateExp = cal.getTime();
        cal.set(2025, Calendar.JANUARY, 1);
        Date datePromo = cal.getTime();


        WorkshopManager wm = WorkshopManager.getInstance(
                "Amine", "B.", "amine@example.com", "amineLogin", "aminePass",
                5, dateExp, datePromo, Status.Active
        );

        System.out.println("=== Display WorkshopManager ===");
        wm.display();


        System.out.println("\n=== Testing changePassword ===");
        wm.changePassword("newSecurePass123");

        System.out.println("\n=== Testing ToSring ===");
        System.out.println(wm.ToSring());


        System.out.println("\n=== Authentication Tests ===");
        System.out.println("Auth1 (correct): " + wm.authentication1("amineLogin", "newSecurePass123"));
        System.out.println("Auth2 (wrong): " + wm.authentication2("amineLogin", "wrongPass"));


        int updatedExp = wm.updatig_Experiance_Date(new Date());
        System.out.println("\nUpdated Experience: " + updatedExp);
    }
}
