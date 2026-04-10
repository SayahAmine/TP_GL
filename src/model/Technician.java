package model;

import enums.Speciality;
import lombok.*;


@Getter
@Setter
@ToString
public class Technician extends  Person {

    private int registration_Number;
    private Speciality speciality;


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


    @Override
    public void changePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        this.setPassword(password);
        System.out.println("Password successfully changed for WorkshopManager: " + getName());
    }

    @Override
    public String ToSring() {
        return "WorkshopManager{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", login='" + getLogin() + '\'' +
                ", registartion number=" + registration_Number +
                ", speciality=" + speciality+
                '}';
    }


    public void display(){
        super.display();
        System.out.println("Registration Number: " + this.registration_Number);
        System.out.println("Speciality: " + this.speciality);
    }
}
