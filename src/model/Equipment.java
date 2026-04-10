package model;

import enums.Status;
import enums.Type;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

@Getter
@Setter
public class Equipment extends Material{

    private int serialNumber;
    private String designation;
    private Type equipmentType;

    private Vector<Component> listComponent = new Vector<>();
    Iterator<Component> iterator = listComponent.iterator();

    private Vector<Repair> repairs = new Vector<>();


    public Equipment(Date acquisitionDate, double price, int serialNumber, String designation, Type equipmentType) {
        super(acquisitionDate, price);
        this.serialNumber = serialNumber;
        this.designation = designation;
        this.equipmentType = equipmentType;
        if (listComponent == null) {
            this.listComponent = new Vector<>();
        } else {
            this.listComponent = listComponent;
        }
    }

    public Equipment(Date acquisitionDate, double price) {
        super(acquisitionDate, price);
    }

    @Override
    public boolean reformCourant(){
        return (this.getRepairs().size() > 10);
    }

    public void displayComponent() {

        while (iterator.hasNext()) {
            Component component = iterator.next();

            System.out.println("Ref: " + component.getComponentRef()
                    + "\nName: " + component.getComponentName()
                    + "\nFabrication Date: " + component.getFabricationDate()
                    + "\nLifespan: " + component.getLifespan()
                    + "\nPrice: " + component.getComponentPrice()
                    + "\nStatus: " + component.getComponentStatus());
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Component {

        private int componentRef;
        private String componentName;
        private Date fabricationDate;
        private int Lifespan;
        private double componentPrice;
        private Status componentStatus;

        public void replace(Component component){
            this.componentRef = component.getComponentRef();
            this.componentName = component.getComponentName();
            this.fabricationDate = component.getFabricationDate();
            this.Lifespan = component.getLifespan();
            this.componentPrice = component.getComponentPrice();
            this.componentStatus = component.getComponentStatus();

        }

        public boolean isfonctional(Component component){
            return componentStatus == Status.Functional;
        }
    }


    public void addComposant(Component c) {
        for (Component comp : listComponent) {
            if (comp.getComponentRef() == c.getComponentRef()) {
                System.out.println("Component already exists!");
                return;
            }
        }
        listComponent.add(c);
    }


    public void removeComposant(Component c) {
        while (iterator.hasNext()) {
            Component comp = iterator.next();
            if (comp.getComponentRef() == c.getComponentRef()) {
                iterator.remove();
                System.out.println("component removed");
                return;
            }
        }
        System.out.println("component not exists !!");
    }

    public void replaceComponent(Component c) {
        while (iterator.hasNext()) {
            Component comp = iterator.next();
            if (comp.getComponentRef() == c.getComponentRef()) {
                comp.replace(c);
                System.out.println("Component replaced ");
                return;
            }
        }
        System.out.println("Component not found !!");
    }




    public void displayEquipment() {

        Iterator<Component> iterator = listComponent.iterator();
        while (iterator.hasNext()) {
            Component comp = iterator.next();
            System.out.println("Ref " + comp.getComponentRef());
            System.out.println("Name " + comp.getComponentName());
            System.out.println("Fabrication Date " + comp.getFabricationDate());
            System.out.println("Lifespan " + comp.getLifespan());
            System.out.println("Status " + comp.getComponentStatus());

        }
    }
}
