

import enums.Status;
import enums.Type;
import model.Equipment;

import java.util.Date;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Equipment equipment = new Equipment(1001, "Office Printer", Type.Imprimante, new Vector<>());

        Equipment.Component comp1 = equipment.new Component(
                201, "Toner Cartridge", new Date(), 365, 50.0, Status.Functional
        );
        Equipment.Component comp2 = equipment.new Component(
                202, "Drum Unit", new Date(), 730, 120.0, Status.Defective
        );
        Equipment.Component comp3 = equipment.new Component(
                203, "Power Supply", new Date(), 1095, 200.0, Status.Functional
        );


        equipment.addComposant(comp1);
        equipment.addComposant(comp2);
        equipment.addComposant(comp3);

        System.out.println("\n--- Equipment Components ---");
        equipment.displayEquipment();


        equipment.addComposant(comp1);


        Equipment.Component newComp2 = equipment.new Component(
                202, "Drum Unit v2", new Date(), 800, 150.0, Status.Functional
        );
        equipment.replaceComponent(newComp2);

        System.out.println("\n--- After Replacement ---");
        equipment.displayEquipment();


        equipment.removeComposant(comp3);

        System.out.println("\n--- After Removal ---");
        equipment.displayEquipment();

        System.out.println("\nIs comp1 functional? " + comp1.isfonctional(comp1));
        System.out.println("Is newComp2 functional? " + newComp2.isfonctional(newComp2));
    }
}
