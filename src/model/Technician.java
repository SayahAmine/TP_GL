package model;

import enums.Speciality;
import lombok.*;


@Getter
@Setter
@ToString
public class Technician extends  Person {

    private int registration_Number;
    private Speciality speciality;

    private Vehicle vehicle;


    public Technician(String name, String surname, String email, String login, String password, int registration_Number, Speciality speciality) {
        super(name, surname, email, login, password);
        this.registration_Number = registration_Number;
        this.speciality = speciality;
    }

    public Technician(int registration_Number, Speciality speciality) {
        this.registration_Number = registration_Number;
        this.speciality = speciality;
    }

    public Technician() {}

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        vehicle.setDriver(this);
    }


    public void display(){
        super.display();
        System.out.println("Registration Number: " + this.registration_Number);
        System.out.println("Speciality: " + this.speciality);
    }
}
