package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Vehicle extends Material {

    private int registrationNumber;
    private String model;
    private Technician driver;

    public Vehicle(Date acquisitionDate, double price, int registrationNumber, String model, Technician driver) {
        super(acquisitionDate, price);
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.driver = driver;
    }

    @Override
    public boolean reformCourant() {
        return ((super.getAcquisitionDate().before(new Date(31/12/2010)))
                && (this.getModel()=="Peugeot"));
    }

    public void addDriver(Technician driver) {
        this.driver = driver;
        driver.setVehicle(this);
    }
}
