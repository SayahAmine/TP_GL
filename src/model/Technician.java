package model;

import enums.Speciality;
import lombok.*;

@Getter
@Setter
public class Technician extends Person {

    private int registrationNumber;
    private Speciality speciality;
    private Vehicle vehicle;


    private Technician chefEquipe;

    public Technician(String name, String surname, String email, String login, String password,
                      int registrationNumber, Speciality speciality) {
        super(name, surname, email, login, password);
        this.registrationNumber = registrationNumber;
        this.speciality = speciality;
    }

    public Technician() {}

    public void designateTeamLeader(Technician newChef) {
        if (newChef == null) {
            throw new IllegalArgumentException("No technician available to assign as team leader");
        }

        if (this.chefEquipe != null) {
            Technician oldChef = this.chefEquipe;
            oldChef.setChefEquipe(null);
            System.out.println("Old chef " + oldChef.getName() + " " + oldChef.getSurname() + " is now a technician.");
        }

        this.chefEquipe = newChef;
        System.out.println("Technician " + newChef.getName() + " " + newChef.getSurname() + " is now the new team leader.");
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        vehicle.setDriver(this);
    }

    public void display() {
        super.display();
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Speciality: " + this.speciality);
        if (chefEquipe != null) {
            System.out.println("Chef d'équipe: " + chefEquipe.getName() + " " + chefEquipe.getSurname());
        }
    }
}
