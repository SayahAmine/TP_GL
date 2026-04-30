package model;

import interfaces.IStrategieReduction;

public class ReductionAutre implements IStrategieReduction {
    public double appliquerReduction(double montant) {
        return montant; // pas de réduction pour autre type
    }
}
