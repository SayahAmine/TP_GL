package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Vehicle {

    private int registrationNumber;
    private String model;
    private Technician driver;

    public void addDriver(Technician driver){
        this.driver=driver;
        driver.setVehicle(this);
    }
}
