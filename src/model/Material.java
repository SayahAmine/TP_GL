package model;

import interfaces.Reformable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Material implements Reformable {

    private Date acquisitionDate;
    private double price;




    @Override
    public boolean reform(Object obj) {

        if(obj instanceof Reformable){
            return ((Reformable)obj).reformCourant();
        }
        return false;
    }

    @Override
    public boolean reformCourant() {
        return false;
    }
}
