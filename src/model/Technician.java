package model;

import enums.Speciality;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Technician extends Person {

    private int registrationNumber;
    private Speciality speciality;
    private Vehicle vehicle;


    private Technician chefEquipe;
    private List<Technician> membres = new ArrayList<>();

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
            this.chefEquipe.getMembres().remove(this);
        }

        this.chefEquipe = newChef;

        if (!newChef.getMembres().contains(this)) {
            newChef.getMembres().add(this);
        }

        System.out.println("Technician " + this.getName() + " now reports to " +
                newChef.getName() + " " + newChef.getSurname());
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
