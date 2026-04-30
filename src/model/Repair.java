package model;

import interfaces.IStrategieReduction;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Iterator;
import java.util.Vector;


@Getter
@Setter
public class Repair {


    private IStrategieReduction strategieReduction;
    private double montantGlobal;

    public Repair(IStrategieReduction strategieReduction, double montantGlobal) {
        this.strategieReduction = strategieReduction;
        this.montantGlobal = montantGlobal;
    }

    public double calculerMontantFinal() {
        return strategieReduction.appliquerReduction(montantGlobal);
    }
}
