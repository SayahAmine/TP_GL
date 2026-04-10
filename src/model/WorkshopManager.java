package model;

import enums.Status;
import lombok.*;

import java.util.Date;



@Getter
@Setter
@ToString
public class WorkshopManager extends Person{

    private static WorkshopManager instance;

    private int nbExperience;
    private Date dateExperience;
    private Date datePromotion;
    private Status status;

    public WorkshopManager(String name, String surname, String email, String login, String password, int nbExperience, Date dateExperience, Date datePromotion, Status status) {
        super(name, surname, email, login, password);
        this.nbExperience = nbExperience;
        this.dateExperience = dateExperience;
        this.datePromotion = datePromotion;
        this.status = status;
    }

    public WorkshopManager(int nbExperience, Date dateExperience, Date datePromotion, Status status) {
        this.nbExperience = nbExperience;
        this.dateExperience = dateExperience;
        this.datePromotion = datePromotion;
        this.status = status;
    }

    public WorkshopManager(){}

    public static WorkshopManager getInstance(String nom, String prenom, String email, String login, String password,
                                              int nbExperience, Date dateExperience, Date datePromotion, Status status) {
        if (instance == null) {
            instance = new WorkshopManager(nom, prenom, email, login, password,
                    nbExperience, dateExperience, datePromotion, status);
        } else {
            System.out.println("\nWorkshopManager already exists\n");
        }
        return instance;
    }


    public int updatig_Experiance_Date(Date dateExp) {
        nbExperience = (int) ((dateExp.getTime() - dateExperience.getTime()) / (1000L * 60 * 60 * 24 * 365));
        return nbExperience;
    }


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
                ", nbExperience=" + nbExperience +
                ", dateExperience=" + dateExperience +
                ", datePromotion=" + datePromotion +
                ", status=" + status +
                '}';
    }


    public void display() {
        super.display();
        System.out.println("Experience: " + nbExperience);
        System.out.println("Date Experience: " + dateExperience);
        System.out.println("Date Promotion: " + datePromotion);
        System.out.println("Statut: " + status);
    }

}
