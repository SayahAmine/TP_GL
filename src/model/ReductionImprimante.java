package model;

import interfaces.IStrategieReduction;

public class ReductionImprimante implements IStrategieReduction {
    public double appliquerReduction(double montant) {
        return montant*0.9; // 10% de réduction pour imprimante
    }
}