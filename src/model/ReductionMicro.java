package model;

import interfaces.IStrategieReduction;

public class ReductionMicro implements IStrategieReduction {
    public double appliquerReduction(double montant) {
        return montant*0.7; // 30% de réduction pour micro
    }
}
