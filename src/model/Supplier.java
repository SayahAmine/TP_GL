package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Iterator;
import java.util.Vector;

@NoArgsConstructor
@Getter
@Setter
public class Supplier {

    private int numRC;
    private String socialreason;
    private String adresse;
    private double capital;

    private Vector<Equipment> Equipments = new Vector<>();
    Iterator<Equipment> iterator =  Equipments.iterator();

    public Supplier(int numRC, String socialreason, String adresse, double capital) {
        this.numRC = numRC;
        this.socialreason = socialreason;
        this.adresse = adresse;
        this.capital = capital;
        if(Equipments == null){
            this.Equipments = new Vector<>();
        }else {
            this.Equipments = Equipments;
        }
    }

    public void addEquipment(Equipment equipment){
        Equipments.add(equipment);
    }

    public void  removeEquipment(Equipment equipment){
        while (iterator.hasNext()){
            Equipment next = iterator.next();
            if (next.equals(equipment)){
                iterator.remove();
            }
        }
        System.out.print("equipment dose not exist");
    }
}
